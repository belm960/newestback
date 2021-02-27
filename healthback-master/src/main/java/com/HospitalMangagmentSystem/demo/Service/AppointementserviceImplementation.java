package com.HospitalMangagmentSystem.demo.Service;

import com.HospitalMangagmentSystem.demo.Dto.AppointementDto;
import com.HospitalMangagmentSystem.demo.Exception.DataNotFoundException;
import com.HospitalMangagmentSystem.demo.domain.Appointement;
import com.HospitalMangagmentSystem.demo.repository.appointementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppointementserviceImplementation implements AppointementService{
    @Autowired
    appointementRepository apprep;
    @Override
    public List<Appointement> getallappointement() {
        return apprep.findAll();
    }

    @Override
    public Appointement createAppointement(AppointementDto appd) {
        Appointement app = new Appointement();
        app.setFirstname(appd.getFirstname());
        app.setLastname(appd.getLastname());
        app.setDob(appd.getDob());
        app.setEmail(appd.getEmail());
        app.setDateofappointment(appd.getDateofappointment());
        app.setTimeofappointment(appd.getTimeofappointment());
        app.setPatient(app.getPatient());
        return apprep.save(app);
    }

    @Override
    public void deleteAppointement(int id) {
        Appointement app = apprep.findById(id).orElseThrow(()->
                new DataNotFoundException("appointement with id " + id + " not found") );
        apprep.delete(app);

    }

    @Override
    public Appointement ubdateAppointement(AppointementDto appd, int id) {
        Appointement app = apprep.findById(id).orElseThrow(()->
                new DataNotFoundException("appointement with id " + id + " not found") );
        app.setFirstname(appd.getFirstname());
        app.setLastname(appd.getLastname());
        app.setDob(appd.getDob());
        app.setEmail(appd.getEmail());
        app.setDateofappointment(appd.getDateofappointment());
        app.setTimeofappointment(appd.getTimeofappointment());
        app.setPatient(app.getPatient());
        return apprep.save(app);
    }
}
