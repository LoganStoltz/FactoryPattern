package Entities;

public class Goblin extends Entity
{
    public Goblin(String name)
    {
        super(name);
    }
    public Goblin(int health, int damage, int defense, int agility, String name)
    {
        super(health, damage, defense, agility, name);
    }//end Goblin constructor
}
