package Entities;

public class Troll extends Entity
{
    public Troll(String name)
    {
        super(name);
    }
    public Troll(int health, int damage, int defense, int agility, String name)
    {
        super(health, damage, defense, agility, name);
    }//end Troll constructor
}