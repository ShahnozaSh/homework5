package com.company;

public class Boss {
    private int health;
    private int damage;
    private String typeDefence;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getTypeDefence() {
        return typeDefence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setTypeDefence(String typeDefence) {
        this.typeDefence = typeDefence;
    }

    public void print() {
        System.out.println("" +
                "health = " + health + "\n" +
                "damage = " + damage + "\n" +
                "typeDefence = " + typeDefence + "\n" +
                "__________"
        );
    }

}
