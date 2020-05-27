package com.lastchance.last_chance.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "terrain")

public class Terrain {

    @Id
    private Integer id_terrain;
    private String title;
    private Integer dropped;
    private String necessary_tool;
    private Integer hits;
    private Integer drop_quantity;


    public Integer getId_terrain() {
        return id_terrain;
    }

    public void setId_terrain(Integer id_terrain) {
        this.id_terrain = id_terrain;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDropped() {
        return dropped;
    }

    public void setDropped(Integer dropped) {
        this.dropped = dropped;
    }

    public String getNecessary_tool() {
        return necessary_tool;
    }

    public void setNecessary_tool(String necessary_tool) {
        this.necessary_tool = necessary_tool;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getDrop_quantity() {
        return drop_quantity;
    }

    public void setDrop_quantity(Integer drop_quantity) {
        this.drop_quantity = drop_quantity;
    }
}
