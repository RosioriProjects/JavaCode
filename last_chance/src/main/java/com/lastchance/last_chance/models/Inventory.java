package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "inventory")
@Table (name = "inventory")
public class Inventory {
    @Id
    private Integer id_instance;
    private Integer id_user;
    private Integer id_item;
    private Integer quantity;
    private Integer equipped;

    public Integer getId_instance() {
        return id_instance;
    }

    public void setId_instance(Integer id_instance) {
        this.id_instance = id_instance;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
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

    public Integer getEquipped() {
        return equipped;
    }

    public void setEquipped(Integer equipped) {
        this.equipped = equipped;
    }
}
