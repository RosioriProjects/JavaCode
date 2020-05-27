package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "items")

public class Items {
    @Id
    private Integer id_item;
    private String title;
    private char equippable_consummable;
    private Integer hp_modifier;
    private Integer armor_modifier;
    private Integer hunger_modifier;
    private Integer weather_modifier;
    private Integer attack_modifier;
    private Integer drop_modifier;
    private Integer speed_modifier;

    public Integer getId_item() {
        return id_item;
    }

    public void setId_item(Integer id_item) {
        this.id_item = id_item;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public char getEquippable_consummable() {
        return equippable_consummable;
    }

    public void setEquippable_consummable(char equippable_consummable) {
        this.equippable_consummable = equippable_consummable;
    }

    public Integer getHp_modifier() {
        return hp_modifier;
    }

    public void setHp_modifier(Integer hp_modifier) {
        this.hp_modifier = hp_modifier;
    }

    public Integer getArmor_modifier() {
        return armor_modifier;
    }

    public void setArmor_modifier(Integer armor_modifier) {
        this.armor_modifier = armor_modifier;
    }

    public Integer getHunger_modifier() {
        return hunger_modifier;
    }

    public void setHunger_modifier(Integer hunger_modifier) {
        this.hunger_modifier = hunger_modifier;
    }

    public Integer getWeather_modifier() {
        return weather_modifier;
    }

    public void setWeather_modifier(Integer weather_modifier) {
        this.weather_modifier = weather_modifier;
    }

    public Integer getAttack_modifier() {
        return attack_modifier;
    }

    public void setAttack_modifier(Integer attack_modifier) {
        this.attack_modifier = attack_modifier;
    }

    public Integer getDrop_modifier() {
        return drop_modifier;
    }

    public void setDrop_modifier(Integer drop_modifier) {
        this.drop_modifier = drop_modifier;
    }

    public Integer getSpeed_modifier() {
        return speed_modifier;
    }

    public void setSpeed_modifier(Integer speed_modifier) {
        this.speed_modifier = speed_modifier;
    }
}
