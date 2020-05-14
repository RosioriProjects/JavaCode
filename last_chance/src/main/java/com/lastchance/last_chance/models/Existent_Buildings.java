package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "existent_buildings")
@Table(name = "existent_buildings")
public class Existent_Buildings extends GameObject {

    private Integer id_building;
    private Integer actual_hp;


    public Integer getId_building() {
        return id_building;
    }

    public void setId_building(Integer id_building) {
        this.id_building = id_building;
    }

    public Integer getActual_hp() {
        return actual_hp;
    }

    public void setActual_hp(Integer actual_hp) {
        this.actual_hp = actual_hp;
    }
}
