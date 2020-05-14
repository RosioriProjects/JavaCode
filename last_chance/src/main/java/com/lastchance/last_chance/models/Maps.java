package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity (name = "maps")
@Table (name = "maps")
public class Maps {
    @Id
    private Integer id_map;
    private Integer id_user;
    private String map_title;
    private Integer length;
    private Integer width;
    private Integer time_spent;
    private Integer temperature;
    private Integer infectivity;
    private Date date_created;

    public Integer getId_map() {
        return id_map;
    }

    public void setId_map(Integer id_map) {
        this.id_map = id_map;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getMap_title() {
        return map_title;
    }

    public void setMap_title(String map_title) {
        this.map_title = map_title;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getTime_spent() {
        return time_spent;
    }

    public void setTime_spent(Integer time_spent) {
        this.time_spent = time_spent;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getInfectivity() {
        return infectivity;
    }

    public void setInfectivity(Integer infectivity) {
        this.infectivity = infectivity;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }
}
