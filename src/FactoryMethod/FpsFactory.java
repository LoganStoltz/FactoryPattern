package FactoryMethod;

import Entities.Entity;
import Entities.DemolitionMan;
import Entities.HeavyGunner;
import Entities.Marksman;
import Entities.Shotgunner;

public class FpsFactory extends Factory{

    Entity createEntity(String entityName){
        if (entityName.equals("demolitionman")){
            return new DemolitionMan(10,10,10,10,"Demo Man");
        }else if (entityName.equals("heavygunner")){
            return new HeavyGunner(10,10,10,10,"Heavy Gunner");
        }else if (entityName.equals("marksman")){
            return new Marksman(10,10,10,10,"Marksman");
        }else if (entityName.equals("shotgunner")) {
            return new Shotgunner(10,10,10,10,"Shotgunner");
        }else return null;
    }
}
