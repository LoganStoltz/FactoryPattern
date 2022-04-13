package Entities;

public class Shotgunner extends Entity
{
    public Shotgunner(String name)
    {
        super(name);
    }
    public Shotgunner(int health, int damage, int defense, int agility, String name)
    {
        super(health, damage, defense, agility, name);
    }//end Shotgunner constructor
}
