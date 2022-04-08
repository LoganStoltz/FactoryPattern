package Entities;

public class Goblin extends Entity
{
    public Goblin(int health, int damage, int defence, int agility, String name)
    {
        super(health, damage, defence, agility, name);
    }//end Goblin constructor

    public String toString()
    {
        return "Goblin Stats: " + super.toString();
    }//end toString

}//end class
