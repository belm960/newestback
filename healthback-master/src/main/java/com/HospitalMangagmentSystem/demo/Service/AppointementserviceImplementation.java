package com.HospitalMangagmentSystem.demo.Service;

import com.HospitalMangagmentSystem.demo.Dto.AppointementDto;
import com.HospitalMangagmentSystem.demo.Exception.DataNotFoundException;
import com.HospitalMangagmentSystem.demo.domain.Appointement;
import com.HospitalMangagmentSystem.demo.domain.User;
import com.HospitalMangagmentSystem.demo.repository.UserRepository;
import com.HospitalMangagmentSystem.demo.repository.appointementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class AppointementserviceImplementation implements AppointementService{
    @Autowired
    appointementRepository apprep;
    @Autowired
    UserRepository userRepo;


    @Override
    public List<Appointement> getallappointement() {
        return apprep.findAll();
    }

    @Override
    @Transactional
    public User createAppointement(AppointementDto appd) {
        String doctorsname = appd.getDoctorsname();
        String delims = "[ ]+";
        String[] tokens = doctorsname.split(delims);
        String firstName = tokens[0];
        String lastName = tokens[1];
        System.out.println(lastName);
        System.out.println(firstName);
        User user = userRepo.findByLastAndFirst(lastName,firstName);


        Appointement app = new Appointement();
        app.setFirstname(appd.getfirstname());
        app.setLastname(appd.getlastname());
        app.setDob(appd.getDob());
        app.setGender(appd.getGender());
        app.setMobile(appd.getMobile());
        app.setEmail(appd.getEmail());
        app.setDateofappointment(appd.getDoa());
        app.setTimeofappointment(appd.getToa());
        // add the appointment into the doctor
        user.addAppointment(app);
        return userRepo.save(user);

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
        app.setFirstname(appd.getfirstname());
        app.setLastname(appd.getlastname());
        app.setDob(appd.getDob());
        app.setEmail(appd.getEmail());
        app.setDateofappointment(appd.getDoa());
        app.setTimeofappointment(appd.getToa());
        app.setInjury(appd.getInjury());
        app.setNotes(appd.getNote());
        app.setPatient(app.getPatient());
        return apprep.save(app);
    }
}
