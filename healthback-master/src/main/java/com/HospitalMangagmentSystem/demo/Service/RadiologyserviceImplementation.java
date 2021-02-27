package com.HospitalMangagmentSystem.demo.Service;

import com.HospitalMangagmentSystem.demo.Dto.LaboratoryDto;
import com.HospitalMangagmentSystem.demo.Dto.RadiologyDto;
import com.HospitalMangagmentSystem.demo.Exception.DataNotFoundException;
import com.HospitalMangagmentSystem.demo.domain.Laboratory;
import com.HospitalMangagmentSystem.demo.domain.Patients;
import com.HospitalMangagmentSystem.demo.domain.Radiology;
import com.HospitalMangagmentSystem.demo.domain.User;
import com.HospitalMangagmentSystem.demo.repository.LaboratoryRepository;
import com.HospitalMangagmentSystem.demo.repository.RadiologyRepository;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@JsonDeserialize
public class RadiologyserviceImplementation implements RadiologyService{


        @Autowired
        RadiologyRepository radrep;


        @Override
        public List<Radiology> getallRadiology() {
            // TODO Auto-generated method stub

            return this.radrep.findAll();
        }


        @Override
        public Radiology getoneRadiology(int id) {
            // TODO Auto-generated method stub
            Radiology rr=radrep.findById(id).orElseThrow(()->
                    new DataNotFoundException("Radiology with id " + id + " not found") );

            return rr;
        }

        @Override
        public Radiology createRadiology(RadiologyDto raddto) {
            // TODO Auto-generated method stub
            Radiology rr = new Radiology();
            rr.setUrgency(raddto.getUrgency());
            rr.setFast(raddto.getFast());
            rr.setDate(raddto.getDate());
            rr.setTesttype(raddto.getTesttype());
            rr.setDrugtherapy(raddto.getDrugtherapy());
            rr.setLastdose(raddto.getLastdose());
            rr.setOtherinfo(raddto.getOtherinfo());
            rr.setProfiletest(raddto.getProfiletest());
            rr.setDiabetis(raddto.getDiabetis());
            rr.setMetformin(raddto.getMetformin());
            rr.setRenalFunction(raddto.getRenalFunction());
            rr.setWeight(raddto.getWeight());
            rr.setPreviousExam(raddto.getPreviousExam());
            rr.setReasonForScan(raddto.getReasonForScan());
            rr.setRelevantHistory(raddto.getRelevantHistory());
            rr.setRadiologistName(raddto.getRadiologistName());
            rr.setUser(rr.getUser());
            rr.setPatient(rr.getPatient());

            return radrep.save(rr);
        }

        @Override
        public void deleteRadiology(int id) {
            radrep.deleteById(id);

        }

        @Override
        public Radiology ubdateRadiology(RadiologyDto raddto, int id) {
            // TODO Auto-generated method stub
            Radiology rr = new Radiology();
            rr=radrep.findById(id).orElseThrow(()->
                    new DataNotFoundException("Radiology with id " + id + " not found") );
            rr.setUrgency(raddto.getUrgency());
            rr.setFast(raddto.getFast());
            rr.setDate(raddto.getDate());
            rr.setTesttype(raddto.getTesttype());
            rr.setDrugtherapy(raddto.getDrugtherapy());
            rr.setLastdose(raddto.getLastdose());
            rr.setOtherinfo(raddto.getOtherinfo());
            rr.setProfiletest(raddto.getProfiletest());
            rr.setDiabetis(raddto.getDiabetis());
            rr.setMetformin(raddto.getMetformin());
            rr.setRenalFunction(raddto.getRenalFunction());
            rr.setWeight(raddto.getWeight());
            rr.setPreviousExam(raddto.getPreviousExam());
            rr.setReasonForScan(raddto.getReasonForScan());
            rr.setRelevantHistory(raddto.getRelevantHistory());
            rr.setRadiologistName(raddto.getRadiologistName());


            User use = new User();
            use.setFirst(raddto.getFirst());
            use.setLast(raddto.getLast());

            rr.setUser(use);



            Patients pat = new Patients();
            pat.setFirst(raddto.getFirstt());
            pat.setLast(raddto.getLastt());

            rr.setPatient(pat);

            return this.radrep.save(rr);
        }

    }




