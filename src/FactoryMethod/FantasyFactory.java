package FactoryMethod;

import Entities.Entity;
import Entities.Goblin;
import Entities.Skeleton;
import Entities.Tarantula;
import Entities.Troll;

public class FantasyFactory extends Factory{

    public Entity createEntity(String entityName){
        if (entityName.equals("goblin")){
            return new Goblin(10,10,10,10,"Grimble");
        }else if (entityName.equals("skeleton")){
            return new Skeleton(10,10,10,10,"Mr. Skellington");
        }else if (entityName.equals("tarantula")){
            return new Tarantula(10,10,10,10,"Arachnar");
        }else if (entityName.equals("troll")) {
            return new Troll(10,10,10,10,"Grognak");
        }else return null;
    }
}
