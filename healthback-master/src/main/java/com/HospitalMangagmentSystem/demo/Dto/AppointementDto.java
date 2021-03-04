package com.HospitalMangagmentSystem.demo.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Time;
import java.util.Date;

public class AppointementDto {
    private String firstname;
    private String lastname;
    private String gender;
    private int mobile;
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
    //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
    private Date dob;
    private String doctorsname;
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
    //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
    private Date doa;

    private String toa;
    private String email;
    private String injury;
    private String note;

    public String getEmail() {
        return email;
    }

    public String getfirstname() {
        return firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public int getMobile() {
        return mobile;
    }

    public Date getDob() {
        return dob;
    }



    public String getDoctorsname() {
        return doctorsname;
    }

    public String getInjury() {
        return injury;
    }

    public String getNote() {
        return note;
    }

    public String getToa() {
        return toa;
    }

    public Date getDoa() {
        return doa;
    }
}