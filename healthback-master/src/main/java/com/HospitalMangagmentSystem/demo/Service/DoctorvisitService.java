package com.HospitalMangagmentSystem.demo.Service;

import java.util.List;

import com.HospitalMangagmentSystem.demo.Dto.VisitBasic;
import com.HospitalMangagmentSystem.demo.Dto.VisitNote;
import org.springframework.stereotype.Service;

import com.HospitalMangagmentSystem.demo.Dto.DoctorvisitDto;
import com.HospitalMangagmentSystem.demo.domain.DoctorsVisit;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Service
@JsonDeserialize 
public interface DoctorvisitService {
	List<DoctorsVisit> getCheckedInPatients();

	void dischargePateint(int id);

	DoctorsVisit getEncounterBy(int id);

	DoctorsVisit addEncounterBasic(VisitBasic basic, int i);

	DoctorsVisit addEncounterNote(VisitNote note, int id);

}
