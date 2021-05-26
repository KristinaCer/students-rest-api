package com.kristina.studentsrestapi.entity;
import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {
    @Column(name = "city_id")
    private long cityId;
    @Column(name = "name")
    private String name;

    public City(String name) {
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
