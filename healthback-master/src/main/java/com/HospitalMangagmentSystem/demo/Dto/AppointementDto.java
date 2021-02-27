package com.HospitalMangagmentSystem.demo.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Time;
import java.util.Date;

public class AppointementDto {
    private String Firstname;
    private String Lastname;
    private String Gender;
    private int mobile;
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
    //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
    private Date dob;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
    //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
    private Date dateofappointment;

    private Time timeofappointment;
    private String email;

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getGender() {
        return Gender;
    }

    public int getMobile() {
        return mobile;
    }

    public Date getDob() {
        return dob;
    }

    public Date getDateofappointment() {
        return dateofappointment;
    }

    public Time getTimeofappointment() {
        return timeofappointment;
    }
}
