package Entities;

public class Factory {

    public void createMonster(String monster){
        Entity entity;

        if (monster.toLowerCase() == "goblin") {
            entity = new Goblin(10, 10, 10,10,"Timmy");
            System.out.println("You made a goblin!");
            System.out.println(entity); //Prints entity stats
        }

    }

}
