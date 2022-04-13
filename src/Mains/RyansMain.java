package Mains;
import Entities.*;
import Atire.*;
import Item.*;
import AbstractFactory.*;

public class RyansMain {

    public static void run(){

        AbstractFactory fantasyFactory = new AbstractFantasyFactory();

        Entity goblin = fantasyFactory.createEntity("Goblin");

        System.out.println(goblin);

    }

}
