package Entites;

public abstract class Entity
{
    private int health;
    private int damage;
    private int defence;
    private int agility;
    private String name;

    public Entity(final int health, final int damage, final int defence, final int agility, final String name)
    {
        if(health < 0 || damage < 0 || defence < 0 || agility < 0 || name.isEmpty())
                throw new IllegalArgumentException("Bad Parameter(s) --- Entity Parent Constructor");

        this.health = health;
        this.damage = damage;
        this.defence = defence;
        this.agility = agility;
        this.name = name;
    }//end Entity Costructor

}//end Class

