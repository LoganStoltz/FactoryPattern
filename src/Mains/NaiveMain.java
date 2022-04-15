package Mains;

import NaiveEntities.*;

public class NaiveMain
{
/*
 *  This method of object creation is very simple and easy where we can have concrete classes being instantiating
 *  during the runtime of the program with our specified set of arguments
 *
 *  However, if we wanted to expand our code at all this would become a very tedious process depending on the
 *  size complexity of the code.
 *  Also keep in mind this is using very simple Constructors, arguments and methods to make this happen.
 *
 *  An Alternative route would be to also consider using interfaces purely for their ability to work with new
 *  classes that are implementing those interfaces through polymorphism (essentially an object that has the
 *  ability to preform the same action in many ways)
 *
 *  Of course having concrete classes involved in this could lead to similar issues down the road that we were
 *  trying to avoid in the first place.
 *
 *  The answer to this problem are Abstract classes for their flexibility since they cannot be instantiated.
 *  This is a key idea for encapsulating object creation .
 */
    public static void main(String[] args)
    {

        Entity entity = new Entity("goblin");

            if (entity.getName() == "goblin"){
                entity = new Goblin(150,100,50,"Naive Goblin");
                System.out.println(entity.toString());
            }
            else if (entity.getName() == "skeleton"){
                entity = new Skeleton(175,175,25,"Naive Skeleton");
                System.out.println(entity.toString());
            }
            else if (entity.getName() == "tarantula"){
                entity = new Tarantula(125,150,0,"Naive Tarantula");
                System.out.println(entity.toString());
            }
            else if (entity.getName() == "troll"){
                entity = new Troll(300,200,100,"Naive Troll");
                System.out.println(entity.toString());
            }
    }
}
