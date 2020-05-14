package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "existent_items")
@Table (name = "existent_items")
public class Existent_Items extends GameObject {


    private Integer id_item;
    private Integer quantity;


    public Integer getId_item() {
        return id_item;
    }

    public void setId_item(Integer id_item) {
        this.id_item = id_item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
