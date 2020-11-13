package com.ksptooi.ge.entity;

public class Player {

    //玩家ID
    private Integer id = null;

    //玩家名称
    private String name = null;

    //玩家生命
    private Integer health = null;


    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", health='" + health + '\'' +
                '}';
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
