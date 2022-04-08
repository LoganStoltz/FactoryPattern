package Entites;

public class Goblin extends Entity
{
    public Goblin(final int health, final int damage, final int defence, final int agility, final String name)
    {
        super(health, damage, defence, agility, name);
    }//end Goblin constructor

    public String toString()
    {
        return "Goblin Stats: " + super.toString();
    }//end toString

}//end class
