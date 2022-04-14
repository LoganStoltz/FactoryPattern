package AbstractFactory;

import Atire.*;
import Entities.Entity;
import Entities.Goblin;
import Entities.Troll;
import Item.*;

public class FantasyEntityItemAndAttireFactorySimplified {

    public Entity createEntity(String entityKey){

        Entity entity;

        if(entityKey.equals("goblin")){
            entity = new Goblin("Azog");
            entity.setWeapon(createItem("Rusty sword"));
            entity.setClothes(createAtire("Goblin armor"));
            return entity;
        }
        else if(entityKey.equals("troll")){
            entity = new Troll("Bradley the troll");
            entity.setWeapon(createItem("Club"));
            entity.setClothes(createAtire("Troll clothes"));
            return entity;
        }
        else
            return null;
    }

    public Item createItem(String itemKey){
        if(itemKey.equals("Rusty sword"))
            return new RustySword();
        else if(itemKey.equals("Club"))
            return new Club();
        else
            return null;
    }

    public Attire createAtire(String atireKey) {
        if(atireKey.equals("Goblin armor"))
            return new GoblinArmor();
        else if(atireKey.equals("troll clothes"))
            return new TrollClothes();
        else
            return null;
    }

}
