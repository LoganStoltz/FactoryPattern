package Mains;

import NaiveEntities.*;

public class EncapsulationObjectCreationMain
{
    public static void main(String[] args)
    {
        Entity ent1 = createEntity("goblin");
        System.out.println(ent1.toString());

        Entity ent2 = createEntity("skeleton");
        System.out.println(ent2.toString());

        Entity ent3 = createEntity("tarantula");
        System.out.println(ent3.toString());

        Entity ent4 = createEntity("troll");
        System.out.println(ent4.toString());
    }

    public static Entity createEntity(String type)
    {
        Entity entity;

        if (type.equals("goblin")){
            return entity = new Goblin(150,100,50,"Goblin    ");
        }
        else if (type.equals("skeleton")){
            return entity = new Skeleton(175,175,25,"Skeleton  ");
        }
        else if (type.equals("tarantula")){
            return entity = new Tarantula(125,150,0,"Tarantula ");
        }
        else if (type.equals("troll")){
            return entity = new Troll(300,200,100,"Troll     ");
        }
        else{
            return null;
        }
    }
}