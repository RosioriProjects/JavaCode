package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "existent_terrain")
@Table(name = "existent_table")
public class ExistentTerrain extends GameObject {

    private Integer id_terrain;
    private Integer hits_remaining;
    private static Integer number_terrains;


    public Integer getId_terrain() {
        return id_terrain;
    }

    public void setId_terrain(Integer id_terrain) {
        this.id_terrain = id_terrain;
    }

    public Integer getHits_remaining() {
        return hits_remaining;
    }

    public void setHits_remaining(Integer hits_remaining) {
        this.hits_remaining = hits_remaining;
    }

    @Override
    public String toString() {
        return "ExistentTerrain{" +
                "id_terrain=" + id_terrain +
                ", hits_remaining=" + hits_remaining +
                ", id_instance=" + id_instance +
                ", id_map=" + id_map +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
