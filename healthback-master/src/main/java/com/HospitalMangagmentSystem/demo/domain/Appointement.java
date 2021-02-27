package com.HospitalMangagmentSystem.demo.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="Appointment")
public class Appointement extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Firstname;
    private String Lastname;
    private String Gender;
    private int mobile;

    @NaturalId(mutable=true)
    @Size(max = 50)
    @Email
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
    //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
    private Date dob;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
    //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
    private Date dateofappointment;

    private Time timeofappointment;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="User_Id")
    //@JsonManagedReference
    @JsonIgnore
    private User user;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="Patient_ID")
    //@JsonManagedReference
    @JsonIgnore
    private Patients patient;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDateofappointment() {
        return dateofappointment;
    }

    public void setDateofappointment(Date dateofappointment) {
        this.dateofappointment = dateofappointment;
    }

    public Time getTimeofappointment() {
        return timeofappointment;
    }

    public void setTimeofappointment(Time timeofappointment) {
        this.timeofappointment = timeofappointment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }


}
