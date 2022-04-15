package NaiveEntities;

public class Entity
{
    private String name;
    private int health, damage, defense;
    public Entity(final int health, final int damage, final int defense, final String name)
    {
        if(name.isEmpty()|| health < 0 || damage < 0 || defense < 0)
            throw new IllegalArgumentException("Bad Parameter(s) in Entity constructor");


        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.name = name;
    }

    public Entity(final String name)
    {
        if(name.isEmpty())
            throw new IllegalArgumentException("Bad Parameter(s) in Entity constructor (String)");

        this.name = name;
    }

    public String getName(){return this.name;}


    public String toString()
    {
        return this.name + " ~  " + "Health:  " + this.health + ", Damage:  " + this.damage + ", Defense:  " + this.defense;
    }
}
