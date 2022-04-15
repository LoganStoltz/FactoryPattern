package Mains;
import AbstractFactory.FantasyEntityItemAndAttireFactory;
import Entities.*;
import AbstractFactory.*;

public class RyansMain {


    public static void runSimpleAbstractFactory(){

        System.out.println("Run simplified abstract factory");

        FantasyEntityItemAndAttireFactorySimplified localFactory = new FantasyEntityItemAndAttireFactorySimplified();

        Entity goblin = localFactory.createEntity("goblin");

        // Give goblin different weapon
        //goblin.setWeapon(localFactory.createItem("Club"));

        System.out.println(goblin + "\nweapon: " + goblin.getWeapon());

    }

    public static void runFantasyEntityItemAndAttireFactory(){

        AbstractEntityItemAndAttireFactory abstractFantasyFactory = new FantasyEntityItemAndAttireFactory();

        Entity goblin = abstractFantasyFactory.createEntity("goblin");

        System.out.println("Abstract factory goblin's toString: " + goblin
                + "\nGoblins item: " + goblin.getWeapon()
        + "\nGoblins clothes: " + goblin.getClothes());

    }

    public static void runFPSEntityItemAndAttireFactory(){

        AbstractEntityItemAndAttireFactory abstractFPSfactory = new FPSentityItemAndAttireFactory();

        Entity goblin = abstractFPSfactory.createEntity("shotgunner");

        System.out.println("Abstract factory goblin's toString: " + goblin
                + "\nGoblins item: " + goblin.getWeapon()
                + "\nGoblins clothes: " + goblin.getClothes());

    }

}
