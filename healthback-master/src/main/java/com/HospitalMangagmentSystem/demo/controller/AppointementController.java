package com.HospitalMangagmentSystem.demo.controller;

import com.HospitalMangagmentSystem.demo.Dto.AppointementDto;
import com.HospitalMangagmentSystem.demo.Dto.PatientDto;
import com.HospitalMangagmentSystem.demo.Service.AppointementService;
import com.HospitalMangagmentSystem.demo.domain.Appointement;
import com.HospitalMangagmentSystem.demo.domain.Patients;
import com.HospitalMangagmentSystem.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AppointementController {
    @Autowired
    AppointementService appsrvice ;
    @GetMapping("/appointement")
    public List<Appointement> getPatient(){

        return this.appsrvice.getallappointement();
    }
    @PostMapping("/appointement/")
    @Transactional
    public ResponseEntity<Object> createappointement(@RequestBody AppointementDto appdto) {
        User appsave =this.appsrvice.createAppointement(appdto);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(appsave.getId()).toUri();
        return ResponseEntity.created(location).build();


    }
    @DeleteMapping("/appointement/{id}")
    @Transactional
    public void deleteappointement( @PathVariable int id) {
        this.appsrvice.deleteAppointement(id);


    }
    @PutMapping("/appointement/{id}")
    @Transactional
    public Appointement updateappointement(@RequestBody AppointementDto appdto , @PathVariable int id) {
        return this.appsrvice.ubdateAppointement(appdto,id);


    }
}
