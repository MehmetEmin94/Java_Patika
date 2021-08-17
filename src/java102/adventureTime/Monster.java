package adventureTime;

import java.util.Random;

public class Monster {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int treasure;
    private int originalHealth;

    public Monster(int id,String name, int damage, int health,int treasure) {
        this.id = id;
        this.name=name;
        this.damage = damage;
        this.health = health;
        this.originalHealth=health;
        this.treasure=treasure;
    }


    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public int getTreasure() {
        return treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
