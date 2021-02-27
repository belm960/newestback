package com.HospitalMangagmentSystem.demo.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class LaboratoryDto {

    private String first;
    private String last;

    private String firstt;
    private String lastt;

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

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getFirstt() {
        return firstt;
    }

    public String getLastt() {
        return lastt;
    }

    public String getUrgency() {
        return urgency;
    }

    public String getFast() {
        return fast;
    }

    public Date getDate() {
        return date;
    }

    public String getTesttype() {
        return testtype;
    }

    public String getDrugtherapy() {
        return drugtherapy;
    }

    public Date getLastdose() {
        return lastdose;
    }

    public String getOtherinfo() {
        return otherinfo;
    }

    public String getProfiletest() {
        return profiletest;
    }

    public String getBiochem() {
        return biochem;
    }

    public String getHematology() {
        return hematology;
    }

    public String getMicrobio() {
        return microbio;
    }

    public String getAnatomicalpathology() {
        return anatomicalpathology;
    }

    public String getLaboratoristname() {
        return laboratoristname;
    }
}
