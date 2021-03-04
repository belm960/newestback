package com.HospitalMangagmentSystem.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HospitalMangagmentSystem.demo.domain.DoctorsVisit;

import java.util.List;


@Repository
public interface DoctorVisitRepository extends JpaRepository<DoctorsVisit, Integer> {
    List<DoctorsVisit> findByStatusNot(String status);


}
