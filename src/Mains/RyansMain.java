package Mains;
import Entities.*;
import Atire.*;
import Item.*;
import AbstractFactory.*;

public class RyansMain {

    public static void run(){

        AbstractEntityItemAndAttireFactory abstractFantasyFactory = new FantasyEntityItemAndAttireFactory();

        Entity goblin = abstractFantasyFactory.createEntity("goblin");

        System.out.println("Abstract factory goblin's toString: " + goblin +
                "\nGoblins item: " + goblin.getWeapon()
        + "\nGoblins clothes: " + goblin.getClothes());

    }

}
