package SimpleFactory;

import Entities.Entity;
import Entities.Goblin;

//By Hunter

public class SimpleFactory {

    public Entity createMonster(String monster){
        Entity entity = null;

        //Just to make things simpler
        String name = monster.toLowerCase();

        if (name.equals("goblin")) {
            entity = new Goblin(10, 10, 10,10,"Timmy");
            System.out.println("You made a goblin!");
            System.out.println(entity+"\n"); //Prints entity stats
        }else{
            System.out.println("That Entity does not exist. Try again.\n");
        }

        return entity;

    }

}
