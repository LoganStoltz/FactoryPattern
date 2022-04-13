package Entities;

public class HeavyGunner extends Entity
{
    public HeavyGunner(String name)
    {
        super(name);
    }
    public HeavyGunner(int health, int damage, int defense, int agility, String name)
    {
        super(health, damage, defense, agility, name);
    }//end HeavyGunner constructor
}
