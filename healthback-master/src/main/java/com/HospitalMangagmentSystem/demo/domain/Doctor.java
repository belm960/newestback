package com.HospitalMangagmentSystem.demo.domain;


import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the doctors database table.
 * 
 */
@Entity
@Table(name="doctors")
@NamedQuery(name="Doctor.findAll", query="SELECT d FROM Doctor d")
public class Doctor extends AuditModel {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int doctor_ID;
	private String doctor_Details;
	private String name;
     

	private String department;





	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="doctor",  cascade = CascadeType.ALL)
   // @JsonManagedReference 
	@JsonIgnore
	private Set<Address> address;




	public Doctor() {
	}

	public int getDoctor_ID() {
		return this.doctor_ID;
	}

	public void setDoctor_ID(int doctor_ID) {
		this.doctor_ID = doctor_ID;
	}

	public String getDoctor_Details() {
		return this.doctor_Details;
	}

	public void setDoctor_Details(String doctor_Details) {
		this.doctor_Details = doctor_Details;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Address addAdreess(Address addres) {
		if(addres == null) {
			address = new HashSet<Address>();
		}
		getAddress().add(addres);
		addres.setDoctor(this);
		
		return addres;
	}




}