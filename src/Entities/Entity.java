package Entities;

import Item.Item;
import Atire.*;

public abstract class Entity
{
    private int health = 100;
    private int damage = 10;
    private int defense = 5;
    private int agility = 3;
    private String name = "BadGuy";
    private Item weapon = null;
    private Atire clothes = null;

    //In the future, we may want separate stats for max health and current health
    public Entity(int health, int damage, int defense, int agility, String name)
     {
        if(health <= 0 || damage < 0 || defense < 0 || agility < 0 || name.isEmpty())
                throw new IllegalArgumentException("Bad Parameter(s) --- Entity Parent Constructor");

        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.agility = agility;
        this.name = name;
    }//end Entity Constructor

    public Entity(String name)
    {
        if(name.isEmpty())
            throw new IllegalArgumentException("Bad Parameter(s) --- Entity Parent Constructor");

        this.name = name;
    }

    // Set Weapon
    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }
    // Set Atire
    public void setAtire(Atire clothes){
        this.clothes = clothes;
    }

    public String toString() {
        //These lines could be condensed into one, but I'm keeping them separate for clarity (at least for now)
        String info = this.name + " has ";
        info += this.health + " hp, ";
        info += this.damage + " damage, ";
        info += this.defense + " defense, ";
        info += this.agility + " agility.";
        return info;
    }


}//end Class

