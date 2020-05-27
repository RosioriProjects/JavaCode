package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "crates")

public class Crates {
    @Id
    private Integer id_crate;
    private Integer id_map;
    private Integer capacity;
    private Integer longitude;
    private Integer latitude;
    private Integer hp;


    public Integer getId_crate() {
        return id_crate;
    }

    public void setId_crate(Integer id_crate) {
        this.id_crate = id_crate;
    }

    public Integer getId_map() {
        return id_map;
    }

    public void setId_map(Integer id_map) {
        this.id_map = id_map;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }
}
