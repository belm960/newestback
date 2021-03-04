package com.HospitalMangagmentSystem.demo.controller;


	import java.net.URI;
import java.util.List;

	import com.HospitalMangagmentSystem.demo.Dto.VisitBasic;
	import com.HospitalMangagmentSystem.demo.Dto.VisitNote;
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
	import org.springframework.transaction.annotation.Transactional;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.HospitalMangagmentSystem.demo.Dto.DoctorDto;
import com.HospitalMangagmentSystem.demo.Dto.DoctorvisitDto;
import com.HospitalMangagmentSystem.demo.Service.DoctorService;
import com.HospitalMangagmentSystem.demo.Service.DoctorvisitService;
import com.HospitalMangagmentSystem.demo.domain.DoctorsVisit;
	import com.HospitalMangagmentSystem.demo.repository.DoctorVisitRepository;

	@RestController
	public class DoctorvisitController {

		@Autowired
		DoctorvisitService service;



		@GetMapping
		List<DoctorsVisit> checkedInPatients() {
			return service.getCheckedInPatients();

		}

		@GetMapping("/discharge/{id}")
		List<DoctorsVisit> dischargePateint(@PathVariable int id) {
			service.dischargePateint(id);
			return service.getCheckedInPatients();
		}

		@GetMapping("enc/{id}")
		DoctorsVisit getEncounterBy(@PathVariable int id) {

			return service.getEncounterBy(id);
		}

		@PostMapping("/basicnote/{id}")
		@org.springframework.transaction.annotation.Transactional
		DoctorsVisit addEncounterBasic(@RequestBody VisitBasic encounter, @PathVariable int id) {
			return service.addEncounterBasic(encounter,id);
			//return service.getEncounterBy(Integer.parseInt(encounter.getEncounterId()));
		}

		@PostMapping("/notes/{id}")
		@Transactional
		DoctorsVisit addEncounterNote(@RequestBody VisitNote note, @PathVariable int id) {
			return service.addEncounterNote(note,id);

		}

	}


