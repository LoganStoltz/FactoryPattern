package Entities;

public class Tarantula extends Entity
{
    public Tarantula(String name)
    {
        super(name);
    }
    public Tarantula(int health, int damage, int defense, int agility, String name)
    {
        super(health, damage, defense, agility, name);
    }//end Tarantula constructor
}