package com.example.springWebapp.Entity;

import javax.persistence.*;

@Entity
@Table(name ="tbl_student")

public class Students {
    //An annotation that makes the empId primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//to auto generate the primary key
    Integer stId;
    String stFirstName;
    String stLastName;
    String stEmail;
    String stPhone;
    String stCourse;

    public Students(Integer stId, String stFirstName, String stFisrtName, String stLastName, String stEmail, String stPhone, String stCourse ) {
        this.stId = stId;
        this.stFirstName = stFirstName;
        this.stLastName = stLastName;
        this.stEmail = stEmail;
        this.stPhone = stPhone;
        this.stCourse = stCourse;

    }
    public Students() {

    }

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStFirstName() {
        return stFirstName;
    }

    public void setStFirstName(String stFirstName) {
        this.stFirstName = stFirstName;
    }

    public String getStLastName() {
        return stLastName;
    }

    public void setStLastName(String stLastName) {
        this.stLastName = stLastName;
    }

    public String getStEmail() {
        return stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail;
    }

    public String getStPhone() {
        return stPhone;
    }

    public void setStPhone(String stPhone) {
        this.stPhone = stPhone;
    }

    public String getStCourse() {
        return stCourse;
    }

    public void setStCourse(String stCourse) {
        this.stCourse = stCourse;
    }


    }


