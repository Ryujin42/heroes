package com.cesi.heroes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Arrays;

@Entity
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
    private String phone;
    private EIncident incident1;
    private EIncident incident2;
    private EIncident incident3;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EIncident getIncident1() {
        return incident1;
    }

    public void setIncident1(EIncident incident1) {
        this.incident1 = incident1;
    }

    public EIncident getIncident2() {
        return incident2;
    }

    public void setIncident2(EIncident incident2) {
        this.incident2 = incident2;
    }

    public EIncident getIncident3() {
        return incident3;
    }

    public void setIncident3(EIncident incident3) {
        this.incident3 = incident3;
    }
}
