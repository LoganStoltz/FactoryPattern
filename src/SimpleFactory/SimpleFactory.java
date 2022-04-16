package SimpleFactory;

import Entities.Entity;
import Entities.Goblin;
import Entities.Skeleton;
import Entities.Troll;

//By Hunter

public class SimpleFactory {

    public Entity createMonster(String monster){
        Entity entity = null;

        //Just to make things simpler
        String name = monster.toLowerCase();

        if (name.equals("goblin")) {
            entity = new Goblin(10, 10, 10,10,"Timmy");
            System.out.println("You made a goblin, named Timmy!");
            System.out.println(entity+"\n"); //Prints entity stats
        }else if(name.equals("troll")){
            entity = new Troll("Bob");
            System.out.println("You made a Troll, named Bob");
            System.out.println(entity+"\n");
        }else if(name.equals("skeleton")){
            entity = new Skeleton("Joe");
            System.out.println("You made a skeleton, named Joe");
            System.out.println(entity+"\n");
        }
        else{
            System.out.println("That Entity does not exist. Try again.\n");
        }

        return entity;

    }

}
