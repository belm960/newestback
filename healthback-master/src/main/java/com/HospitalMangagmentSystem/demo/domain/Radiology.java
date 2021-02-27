package com.HospitalMangagmentSystem.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="radiology")
@NamedQuery(name="Radiology.findAll", query="SELECT r FROM Radiology r")


public class Radiology extends AuditModel {

        @Id
        @GeneratedValue
        private int radid;


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

        private String diabetis;
        private String metformin;

        private String renalFunction;

        private String weight;

        private String previousExam;
        private String reasonForScan;

        private String relevantHistory;

        private String radiologistName;

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

        public int getRadid() {
                return radid;
        }

        public void setRadid(int radid) {
                this.radid = radid;
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

        public String getDiabetis() {
                return diabetis;
        }

        public void setDiabetis(String diabetis) {
                this.diabetis = diabetis;
        }

        public String getMetformin() {
                return metformin;
        }

        public void setMetformin(String metformin) {
                this.metformin = metformin;
        }

        public String getRenalFunction() {
                return renalFunction;
        }

        public void setRenalFunction(String renalFunction) {
                this.renalFunction = renalFunction;
        }

        public String getWeight() {
                return weight;
        }

        public void setWeight(String weight) {
                this.weight = weight;
        }

        public String getPreviousExam() {
                return previousExam;
        }

        public void setPreviousExam(String previousExam) {
                this.previousExam = previousExam;
        }

        public String getReasonForScan() {
                return reasonForScan;
        }

        public void setReasonForScan(String reasonForScan) {
                this.reasonForScan = reasonForScan;
        }

        public String getRelevantHistory() {
                return relevantHistory;
        }

        public void setRelevantHistory(String relevantHistory) {
                this.relevantHistory = relevantHistory;
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

        public String getRadiologistName() {
                return radiologistName;
        }

        public void setRadiologistName(String radiologistName) {
                this.radiologistName = radiologistName;
        }
}
