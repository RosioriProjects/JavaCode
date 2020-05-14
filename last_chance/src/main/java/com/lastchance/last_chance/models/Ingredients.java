package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "ingredients")
@Table (name = "ingredients")
public class Ingredients {
    @Id
    private Integer id_ingredient;
    private String title;

    public Integer getId_ingredient() {
        return id_ingredient;
    }

    public void setId_ingredient(Integer id_ingredient) {
        this.id_ingredient = id_ingredient;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
