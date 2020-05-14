package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "results")
@Table (name = "results")
public class Results {

    @Id
    private Integer id_result;
    private String title;
    private String category;

    public Integer getId_result() {
        return id_result;
    }

    public void setId_result(Integer id_result) {
        this.id_result = id_result;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
