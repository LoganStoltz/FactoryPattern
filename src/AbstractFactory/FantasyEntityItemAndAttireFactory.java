package AbstractFactory;

import Atire.*;
import Entities.Entity;
import Entities.Goblin;
import Entities.Troll;
import FactoryMethod.Factory;
import FactoryMethod.FantasyFactory;
import Item.*;

public class FantasyEntityItemAndAttireFactory extends AbstractEntityItemAndAttireFactory{

        /* Entity keys
            - "Goblin": Goblin
            - "Troll: Troll

           Item keys
            - "Rusty sword": RustSword
            - "Club": Club

            Attire keys
            - "Goblin Armor": GoblinArmor
            - "Troll clothes": TrollClothes
         */

        // Constructor
        public FantasyEntityItemAndAttireFactory() {
            super(new FantasyFactory(),new FantasyItemFactory(),new FantasyAttireFactory());
        }
        // Create Entity
        @Override
        public Entity createEntity(String entityKey){

            Entity entity;

            if(entityKey.equals("goblin")){
                entity = this.getFactory().createEntity("goblin");
                entity.setWeapon(this.getItemFactory().createItem("Rusty sword"));
                entity.setClothes(this.getAttireFactory().createAttire("Goblin armor"));
                return entity;
            }
            else if(entityKey.equals("Troll")){
                entity = this.getFactory().createEntity("troll");
                entity.setWeapon(this.getItemFactory().createItem("Club"));
                entity.setClothes(this.getAttireFactory().createAttire("Troll clothes"));
                return entity;
            }
            else
                return null;
        }

        // Create item
        @Override
        public Item createItem(String itemKey){
            return this.getItemFactory().createItem(itemKey);
        }

        // Create Attire
        @Override
        public Atire createAttire(String attireKey){
            return this.getAttireFactory().createAttire(attireKey);
        }
}
