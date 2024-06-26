package com.example.webapi.Model;

import jakarta.persistence.*;

@Entity
@Table(name="Geo")
public class Geo {
    @Id

    private String lat;
    private String lng;

    public Geo() {
    }
    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }


    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
