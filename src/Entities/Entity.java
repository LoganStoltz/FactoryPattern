package Entities;

public abstract class Entity
{
    private int health;
    private int damage;
    private int defence;
    private int agility;
    private String name;

    public Entity(int health, int damage, int defence, int agility, String name)
    {
        if(health <= 0 || damage < 0 || defence < 0 || agility < 0 || name.isEmpty())
                throw new IllegalArgumentException("Bad Parameter(s) --- Entity Parent Constructor");

        this.health = health;
        this.damage = damage;
        this.defence = defence;
        this.agility = agility;
        this.name = name;
    }//end Entity Constructor

}//end Class

