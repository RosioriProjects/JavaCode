package com.lastchance.last_chance.models;

import javax.persistence.Entity;

@Entity(name = "existent_items")
public class ExistentItems extends GameObject {


    private Integer id_item;
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
   }

    public Integer getId_item() {
        return id_item;
    }

    public void setId_item(Integer id_item) {
        this.id_item = id_item;
    }



}
