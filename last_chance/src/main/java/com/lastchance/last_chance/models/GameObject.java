package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "game_object")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class GameObject {
    @Id
    protected Integer id_instance;
    protected Integer id_map;
    protected Integer longitude;
    protected Integer latitude;


    public Integer getId_instance() {
        return id_instance;
    }

    public void setId_instance(Integer id_instance) {
        this.id_instance = id_instance;
    }

    public Integer getId_map() {
        return id_map;
    }

    public void setId_map(Integer id_map) {
        this.id_map = id_map;
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



}
