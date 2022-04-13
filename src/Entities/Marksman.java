package Entities;

public class Marksman extends Entity
{
    public Marksman(String name)
    {
        super(name);
    }
    public Marksman(int health, int damage, int defense, int agility, String name)
    {
        super(health, damage, defense, agility, name);
    }//end Marksman constructor
}
