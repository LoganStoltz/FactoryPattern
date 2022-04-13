package AbstractFactory;

import Atire.*;
import Entities.*;
import Item.*;

public class AbstractFantasyFactory extends AbstractFactory{

    // Keys

    // Create Entity
    @Override
    public Entity createEntity(String entityKey){

        Entity entity;

        if(entityKey.equals("Goblin")){
            entity = new Goblin(2,2,2,4,"Mulrok");
            entity.setWeapon(createItem("Rusty sword"));
            entity.setAtire(createAtire("Goblin Armor"));
            return entity;
        }
        else if(entityKey.equals("Troll")){
            entity = new Troll();
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

    public Atire createAtire(String atireKey) {
        if(atireKey.equals("Goblin Armor"))
            return new GoblinArmor();
        else if(atireKey.equals("Troll clothes"))
            return new TrollClothes();
        else
            return null;
    }

}
