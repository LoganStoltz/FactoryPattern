package Mains;

import NaiveEntities.*;

public class EncapsulationObjectCreationMain
{
    public static void main(String[] args)
    {
        Entity ent1 = createEntity("goblin");
        System.out.println(ent1);

        Entity ent2 = createEntity("skeleton");
        System.out.println(ent2);

        Entity ent3 = createEntity("tarantula");
        System.out.println(ent3);

        Entity ent4 = createEntity("troll");
        System.out.println(ent4);
    }

    public static Entity createEntity(String type)
    {

        if (type.equals("goblin")){
            return new Goblin(150,100,50,"Goblin    ");
        }
        else if (type.equals("skeleton")){
            return new Skeleton(175,175,25,"Skeleton  ");
        }
        else if (type.equals("tarantula")){
            return new Tarantula(125,150,0,"Tarantula ");
        }
        else if (type.equals("troll")){
            return new Troll(300,200,100,"Troll     ");
        }
        else{
            return null;
        }
    }
}