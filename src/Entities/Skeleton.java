package Entities;

public class Skeleton extends Entity
{
    public Skeleton(String name)
    {
        super(name);
    }
    public Skeleton(int health, int damage, int defense, int agility, String name)
    {
        super(health, damage, defense, agility, name);
    }//end Skeleton constructor
}