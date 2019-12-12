package com.xupt.io.ObjectStream;

import java.io.Serializable;

public class Hero implements Serializable {
    private static final long serialVersionUID=1L;
    private String name;
    private float hp;
    public Hero(){}
    public Hero(String name,float hp){
        this.name=name;
        this.hp=hp;
    }

    public String getName() {
        return name;
    }

    public float getHp() {
        return hp;
    }
}
