package com.HospitalMangagmentSystem.demo.domain;

import com.amazonaws.services.glue.model.Order;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="laboratory")
@NamedQuery(name="Laboratory.findAll", query="SELECT l FROM Laboratory l")
public class Laboratory extends AuditModel{
    @Id
    @GeneratedValue
    private int labid;
    private String urgency;
    private String fast;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
    //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
    private Date date;

    private String testtype;

    private String drugtherapy;



    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
    //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
    private Date lastdose;

    private String otherinfo;

    private String profiletest;

    private String biochem;

    private String hematology;

    private String microbio;

    private String anatomicalpathology;

    private String laboratoristname;

    //bi-directional many-to-one association to Doctor
    @ManyToOne(fetch=FetchType.LAZY,  cascade = CascadeType.ALL)
    @JoinColumn(name="User_ID")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    //@JsonIgnore
    private User user;

    //bi-directional many-to-one association to Patient
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="Patient_ID")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Patients patient;


    public int getLabid() {
        return labid;
    }

    public void setLabid(int labid) {
        this.labid = labid;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getFast() {
        return fast;
    }

    public void setFast(String fast) {
        this.fast = fast;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTesttype() {
        return testtype;
    }

    public void setTesttype(String testtype) {
        this.testtype = testtype;
    }

    public String getDrugtherapy() {
        return drugtherapy;
    }

    public void setDrugtherapy(String drugtherapy) {
        this.drugtherapy = drugtherapy;
    }

    public Date getLastdose() {
        return lastdose;
    }

    public void setLastdose(Date lastdose) {
        this.lastdose = lastdose;
    }

    public String getOtherinfo() {
        return otherinfo;
    }

    public void setOtherinfo(String otherinfo) {
        this.otherinfo = otherinfo;
    }

    public String getProfiletest() {
        return profiletest;
    }

    public void setProfiletest(String profiletest) {
        this.profiletest = profiletest;
    }

    public String getBiochem() {
        return biochem;
    }

    public void setBiochem(String biochem) {
        this.biochem = biochem;
    }

    public String getHematology() {
        return hematology;
    }

    public void setHematology(String hematology) {
        this.hematology = hematology;
    }

    public String getMicrobio() {
        return microbio;
    }

    public void setMicrobio(String microbio) {
        this.microbio = microbio;
    }

    public String getAnatomicalpathology() {
        return anatomicalpathology;
    }

    public void setAnatomicalpathology(String anatomicalpathology) {
        this.anatomicalpathology = anatomicalpathology;
    }

    public String getLaboratoristname() {
        return laboratoristname;
    }

    public void setLaboratoristname(String laboratoristname) {
        this.laboratoristname = laboratoristname;
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
