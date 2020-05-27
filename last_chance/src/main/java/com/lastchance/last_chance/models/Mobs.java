package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "mobs")

public class Mobs {

    @Id
    private Integer id_mob;
    private String mob_title;
    private char behaviour;
    private Integer hp;
    private Integer attack;
    private Integer food;
    private Integer speed;
    private Integer armor;


    public Integer getId_mob() {
        return id_mob;
    }

    public void setId_mob(Integer id_mob) {
        this.id_mob = id_mob;
    }

    public String getMob_title() {
        return mob_title;
    }

    public void setMob_title(String mob_title) {
        this.mob_title = mob_title;
    }

    public char getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(char behaviour) {
        this.behaviour = behaviour;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }
}
