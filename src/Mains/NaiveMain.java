package Mains;

import NaiveEntities.*;

public class NaiveMain
{

    public static void main(String[] args)
    {

        Entity goblin1 = new Entity("skeleton");

        if (goblin1.getName().equals("goblin")){
            goblin1 = new Goblin(150,100,50,"Naive Goblin   ");
            System.out.println(goblin1);
        }
        else if (goblin1.getName().equals("skeleton")){
            goblin1 = new Skeleton(175,175,25,"Naive Skeleton ");
            System.out.println(goblin1);
        }
        else if (goblin1.getName().equals("tarantula")){
            goblin1 = new Tarantula(125,150,0,"Naive Tarantula");
            System.out.println(goblin1);
        }
        else if (goblin1.getName().equals("troll")){
            goblin1 = new Troll(300,200,100,"Naive Troll    ");
            System.out.println(goblin1);
        }


        /*
        Entity goblin2 = new Entity("goblin");
        goblin2 = new Goblin(150,100,50,"Naive Goblin   ");
        System.out.println(goblin2.toString());

        Entity skeleton = new Entity("skeleton");
        skeleton = new Skeleton(175,175,25,"Naive Skeleton ");
        System.out.println(skeleton.toString());

        Entity tarantula = new Entity("tarantula");
        tarantula = new Tarantula(125,150,0,"Naive Tarantula");
        System.out.println(tarantula.toString());

        Entity troll = new Entity("troll");
        troll = new Troll(300,200,100,"Naive Troll    ");
        System.out.println(troll.toString());
        */
    }
}
