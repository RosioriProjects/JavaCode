package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "stored_items")
@Table (name = "stored_items")
public class StoredItems {

    @Id
    private Integer id_instance;
    private Integer id_crate;
    private Integer id_item;
    private Integer quantity;

    public Integer getId_instance() {
        return id_instance;
    }

    public void setId_instance(Integer id_instance) {
        this.id_instance = id_instance;
    }

    public Integer getId_crate() {
        return id_crate;
    }

    public void setId_crate(Integer id_crate) {
        this.id_crate = id_crate;
    }

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
