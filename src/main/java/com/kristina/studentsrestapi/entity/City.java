package com.kristina.studentsrestapi.entity;

import javax.persistence.*;

@Entity
public class City {
    private long cityId;
    private String name;

    public City(long cityId, String name) {
        this.cityId = cityId;
        this.name = name;
    }

    public City() {
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getCityId() {
        return cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
