package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "recipes")
@Table (name = "recipes")
public class Recipes {

    @Id
    private Integer id_ingredient;
    private Integer quantity_ingredient;
    private Integer id_result;
    private Integer quantity_result;

    public Integer getId_ingredient() {
        return id_ingredient;
    }

    public void setId_ingredient(Integer id_ingredient) {
        this.id_ingredient = id_ingredient;
    }

    public Integer getQuantity_ingredient() {
        return quantity_ingredient;
    }

    public void setQuantity_ingredient(Integer quantity_ingredient) {
        this.quantity_ingredient = quantity_ingredient;
    }

    public Integer getId_result() {
        return id_result;
    }

    public void setId_result(Integer id_result) {
        this.id_result = id_result;
    }

    public Integer getQuantity_result() {
        return quantity_result;
    }

    public void setQuantity_result(Integer quantity_result) {
        this.quantity_result = quantity_result;
    }
}
