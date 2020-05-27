package com.lastchance.last_chance.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")

public class User {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_user;
    private String username;
    private String password;
    private String nickname;
    private Integer hp;
    private Integer armor;
    private Integer speed;

    private Integer attack_value;
    private Integer hunger;
    private Integer sickness;
    private Integer longitude;
    private Integer latitude;


    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack_value() {
        return attack_value;
    }

    public void setAttack_value(int attack_value) {
        this.attack_value = attack_value;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getSickness() {
        return sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "User{" +
                "id_user=" + id_user +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                ", speed=" + speed +
                ", attack_value=" + attack_value +
                ", hunger=" + hunger +
                ", sickness=" + sickness +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }

}
