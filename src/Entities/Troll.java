package Entities;

public class Troll extends Entity
{
    public Troll(int health, int damage, int defense, int agility, String name)
    {
        super(health, damage, defense, agility, name);
    }//end Troll constructor

    // Constructor for fully defined Troll
    public Troll(String trollName){
        super(8,8,8,1,trollName);
    }
}