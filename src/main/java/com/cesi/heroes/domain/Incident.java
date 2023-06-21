package com.cesi.heroes.domain;

import jakarta.persistence.*;

@Entity
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @ManyToOne
    @JoinColumn(name = "city")
    public final City city;
    public final double latitude;
    public final double longitude;
    public final EIncident incident;

    public Incident(City city, double latitude, double longitude, EIncident incident) {
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.incident = incident;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public EIncident getIncident() {
        return incident;
    }
}
