package com.HospitalMangagmentSystem.demo.Service;

import java.util.List;

import com.HospitalMangagmentSystem.demo.Dto.VisitBasic;
import com.HospitalMangagmentSystem.demo.Dto.VisitNote;
import com.HospitalMangagmentSystem.demo.Exception.DataNotFoundException;
import com.HospitalMangagmentSystem.demo.constants.MedicalUtil;
import com.HospitalMangagmentSystem.demo.domain.DoctorsVisit;
import com.HospitalMangagmentSystem.demo.repository.DoctorVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.HospitalMangagmentSystem.demo.Dto.DoctorDto;
import com.HospitalMangagmentSystem.demo.domain.Address;
import com.HospitalMangagmentSystem.demo.domain.Doctor;
import com.HospitalMangagmentSystem.demo.repository.AddressRepository;
import com.HospitalMangagmentSystem.demo.repository.Doctorrepository;
@Component
public class DoctorserviceImplementation implements DoctorService {
	/**@Autowired
	DoctorVisitRepository encounterRepo;

	@Override
	public List<DoctorsVisit> getCheckedInPatients() {
		return encounterRepo.findByStatusNot(MedicalUtil.ENCOUNTER_STATUS_COMPLETED);
	}



	@Override
	public void dischargePateint(int id) {
		DoctorsVisit encounter = encounterRepo.findById(id).orElse(null);
		if(encounter != null) {
			encounter.setStatus(MedicalUtil.ENCOUNTER_STATUS_COMPLETED);
			encounterRepo.save(encounter);
		}

	}

	@Override
	public DoctorsVisit getEncounterBy(int id) {
		return encounterRepo.findById(id).orElse(null);
	}





	@Override
	public DoctorsVisit addEncounterBasic(VisitBasic encounter, int id) {
		//Optional<Visit> enc = Optional.ofNullable(encounterRepo.findByEncounterid(id));
		//Visit visit = enc.get();
		// System.out.println(visit.getPulse());
		DoctorsVisit enc =  encounterRepo.findById(id).orElse(null);

		// Optional<Iterable<Visit>> vehicle = this,encounterRepo.findById(id);
		//Visit enc =encounterRepo.findById(id).orElseThrow(()->
		//  new DataNotFoundException("patient with id " + id + " not found") )

		enc.setStatus(MedicalUtil.ENCOUNTER_STATUS_IN_PROGRESS);
		enc.setPulse(encounter.getPulse());
		enc.setTemp(encounter.getTemp());
		enc.setSat(encounter.getSat());
		//enc.setRespRate(encounter.getRespRate());
		enc.setWeight(encounter.getWeight());


		enc.setPulse(encounter.getPulse());
		return encounterRepo.save(enc);
	}

	@Override
	public DoctorsVisit addEncounterNote(VisitNote note, int id) {
		DoctorsVisit enc =  encounterRepo.findById(id).orElse(null);
		enc.setRemark(note.getRemark());
		enc.setTreatment(note.getTreatment());
		enc.setChiefComplaint(note.getChiefComplaint());
		return  encounterRepo.save(enc);

	}*/

}
