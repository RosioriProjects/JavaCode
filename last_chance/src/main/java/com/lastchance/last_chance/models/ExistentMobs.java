package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "existent_mobs")
@Table(name = "existent_mobs")
public class ExistentMobs extends GameObject {

    private Integer id_mob;
    private Integer actual_hp;
    private static Integer number_mobs;

    public Integer getId_mob() {
        return id_mob;
    }

    public void setId_mob(Integer id_mob) {
        this.id_mob = id_mob;
    }

    public Integer getActual_hp() {
        return actual_hp;
    }

    public void setActual_hp(Integer actual_hp) {
        this.actual_hp = actual_hp;
    }
}
