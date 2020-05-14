package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "drops")
@Table(name = "drops")
public class Drops {
    @Id
    private Integer id_drop;
    private Integer id_mob;
    private Integer quantity;


    public Integer getId_drop() {
        return id_drop;
    }

    public void setId_drop(Integer id_drop) {
        this.id_drop = id_drop;
    }

    public Integer getId_mob() {
        return id_mob;
    }

    public void setId_mob(Integer id_mob) {
        this.id_mob = id_mob;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
