package com.HospitalMangagmentSystem.demo.controller;

import com.HospitalMangagmentSystem.demo.Dto.AddressDto;
import com.HospitalMangagmentSystem.demo.Dto.LaboratoryDto;
import com.HospitalMangagmentSystem.demo.Service.AddresService;
import com.HospitalMangagmentSystem.demo.Service.LaboratoryService;
import com.HospitalMangagmentSystem.demo.domain.Address;
import com.HospitalMangagmentSystem.demo.domain.Laboratory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;
import java.util.List;

@RestController
public class LaboratoryController {

    @Autowired
    LaboratoryService labservice;

    @GetMapping("/laboratory")
    public List<Laboratory> getLaboratory ()   {

        return this.labservice.getallLaboratories();
    }



    @GetMapping("/Laboratory/{id}")
    public Laboratory getUserLaboratoryByid(@PathVariable int id, @RequestBody LaboratoryDto lab ){

        return  labservice.getonelaboratory(id);
    }
    @PostMapping("/Laboratory/")
    @Transactional
    public ResponseEntity<Object> createLaboratory(@RequestBody LaboratoryDto lab ){

        Laboratory labsave = this.labservice.createLaboratory(lab);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(labsave.getLabid()).toUri();

        return ResponseEntity.created(location).build();


    }


    @PutMapping("/Laboratory/{id}")
    public Laboratory updateLaboratory(@PathVariable int id, @RequestBody LaboratoryDto lab){


        return this.labservice.ubdateLaboratory(lab, id);
    }
    @DeleteMapping("/Laboratory/{id}")
    public void deleteLaboratory(@PathVariable int id){

        this.labservice.deleteLaboratory(id);
    }




}
