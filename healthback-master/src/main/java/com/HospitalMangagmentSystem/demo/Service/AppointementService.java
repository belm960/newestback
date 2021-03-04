package com.HospitalMangagmentSystem.demo.Service;

import com.HospitalMangagmentSystem.demo.Dto.AddressDto;
import com.HospitalMangagmentSystem.demo.Dto.AppointementDto;
import com.HospitalMangagmentSystem.demo.domain.Address;
import com.HospitalMangagmentSystem.demo.domain.Appointement;
import com.HospitalMangagmentSystem.demo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppointementService {
    List<Appointement> getallappointement();

    // Appointement getoneApointment(int id);

    User createAppointement(AppointementDto appd);

    void deleteAppointement(int id);

    Appointement ubdateAppointement(AppointementDto appd , int id);
}

