package com.shalintha.studentservice.model;

import javax.persistence.*;

@Entity
public class Address {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer aid;
    String city;


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
