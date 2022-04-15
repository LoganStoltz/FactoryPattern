package AbstractFactory;

import Atire.Attire;
import Entities.Entity;
import FactoryMethod.FpsFactory;
import Item.Item;

public class FPSentityItemAndAttireFactory extends AbstractEntityItemAndAttireFactory{

    // Constructor
    public FPSentityItemAndAttireFactory() {
        super(new FpsFactory(),
                new FPSitemFactory(),
                new FPSattireFactory());
    }

    // Create FPS entity
    @Override
    public Entity createEntity(String entityKey){
        return this.getFactory().createEntity(entityKey);
    }

    // Create FPS item
    @Override
    public Item createItem(String itemKey){
        return this.getItemFactory().createItem(itemKey);
    }

    // Create FPS attire
    @Override
    public Attire createAttire(String attireKey){
        return this.getAttireFactory().createAttire(attireKey);
    }
}
