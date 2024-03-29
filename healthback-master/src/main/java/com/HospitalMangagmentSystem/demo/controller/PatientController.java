package com.HospitalMangagmentSystem.demo.controller;


	import java.net.URI;
import java.sql.Date;
import java.util.List;

	import javax.transaction.Transactional;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;
	import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.HospitalMangagmentSystem.demo.Dto.PatientDto;
import com.HospitalMangagmentSystem.demo.Service.PatientService;
import com.HospitalMangagmentSystem.demo.domain.Address;
import com.HospitalMangagmentSystem.demo.domain.Patients;
import com.HospitalMangagmentSystem.demo.domain.Publicorprivateinsurance;
import com.HospitalMangagmentSystem.demo.domain.Refcalendar;
import com.HospitalMangagmentSystem.demo.domain.Refdiseases;
import com.HospitalMangagmentSystem.demo.repository.AddressRepository;
import com.HospitalMangagmentSystem.demo.repository.PatientRepository;
import com.HospitalMangagmentSystem.demo.repository.PublicorprivateinsuranceRepository;
import com.HospitalMangagmentSystem.demo.repository.RefcalendarRepository;
import com.HospitalMangagmentSystem.demo.repository.Refdiseasesrepository;

    @CrossOrigin(origins = "*", maxAge = 3600)
	@RestController
	public class PatientController {

		@Autowired
		PatientService patiservice;
		
		@GetMapping("/Patient")
		public List<Patients> getPatient(){
		
			return this.patiservice.getallpatient();
		}
		@GetMapping("/checkIn/{id}")
		public Patients checkInPateint(@PathVariable int id){
			return patiservice.checkInPateint(id);
		}
		
		@PostMapping("/Patient/")
		@Transactional
		public ResponseEntity<Object>  createpatient(@RequestBody PatientDto patidt) {
				Patients patsave =this.patiservice.createpatient(patidt);
				URI location = ServletUriComponentsBuilder
		                .fromCurrentRequest()
		                .path("/{id}")
		                .buildAndExpand(patsave.getPatient_ID()).toUri();
				return ResponseEntity.created(location).build();
			
			
		}
		
		@GetMapping("/Patient/{id}")
		@Transactional
		public Patients getonepatient( @PathVariable int id) {
			
			return this.patiservice.getonepatient(id);		
			
		}
		
		@DeleteMapping("/Patient/{id}")
		@Transactional
		public void deletepatient( @PathVariable int id) {
			this.patiservice.deletepatient(id);
			
			
		}
		
		@PutMapping("/Patient/{id}")
		@Transactional
		public Patients updatepatient(@RequestBody PatientDto pati , @PathVariable int id) {
			return this.patiservice.ubdatepatient(pati, id);
			
			
		}
		
		
		
		
	}


