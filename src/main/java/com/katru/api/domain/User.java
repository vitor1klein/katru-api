package com.katru.api.domain;

import java.time.LocalDateTime;

public class User {

    private Integer userID;
    private String userCPF;
    private String userName;
    private String email;
    private String phoneNumber;
    private Boolean active;
    private LocalDateTime dtCreation;
    private LocalDateTime dtUpdate;


    public User(Integer userID, String userCPF, String userName, String email, String phoneNumber, Boolean active,
            LocalDateTime dtCreation, LocalDateTime dtUpdate) {
        this.userID = userID;
        this.userCPF = userCPF;
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.active = active;
        this.dtCreation = dtCreation;
        this.dtUpdate = dtUpdate;
    }


    public Integer getUserID() {
        return userID;
    }


    public void setUserID(Integer userID) {
        this.userID = userID;
    }


    public String getUserCPF() {
        return userCPF;
    }


    public void setUserCPF(String userCPF) {
        this.userCPF = userCPF;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Boolean getActive() {
        return active;
    }


    public void setActive(Boolean active) {
        this.active = active;
    }


    public LocalDateTime getDtCreation() {
        return dtCreation;
    }


    public void setDtCreation(LocalDateTime dtCreation) {
        this.dtCreation = dtCreation;
    }


    public LocalDateTime getDtUpdate() {
        return dtUpdate;
    }


    public void setDtUpdate(LocalDateTime dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    
    

}