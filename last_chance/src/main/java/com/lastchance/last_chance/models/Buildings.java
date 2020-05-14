package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name = "buildings")
@Table(name = "buildings")
public class Buildings {
    @Id
    private Integer id_building;
    private String title;
    private Integer dimension_lat;
    private Integer dimension_long;
    private Integer hp;
    private Integer solid;
    private Integer damage;
    private Integer item_reproduction;
    private Integer ammount;
    private Integer time_of_execution;
    private Integer range_of_action;


    public Integer getId_building() {
        return id_building;
    }

    public void setId_building(Integer id_building) {
        this.id_building = id_building;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDimension_lat() {
        return dimension_lat;
    }

    public void setDimension_lat(Integer dimension_lat) {
        this.dimension_lat = dimension_lat;
    }

    public Integer getDimension_long() {
        return dimension_long;
    }

    public void setDimension_long(Integer dimension_long) {
        this.dimension_long = dimension_long;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getSolid() {
        return solid;
    }

    public void setSolid(Integer solid) {
        this.solid = solid;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getItem_reproduction() {
        return item_reproduction;
    }

    public void setItem_reproduction(Integer item_reproduction) {
        this.item_reproduction = item_reproduction;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }

    public Integer getTime_of_execution() {
        return time_of_execution;
    }

    public void setTime_of_execution(Integer time_of_execution) {
        this.time_of_execution = time_of_execution;
    }

    public Integer getRange_of_action() {
        return range_of_action;
    }

    public void setRange_of_action(Integer range_of_action) {
        this.range_of_action = range_of_action;
    }
}
