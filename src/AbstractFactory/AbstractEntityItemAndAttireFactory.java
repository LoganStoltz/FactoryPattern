package AbstractFactory;
import Atire.Attire;
import FactoryMethod.*;

import Entities.Entity;
import Item.Item;

public abstract class AbstractEntityItemAndAttireFactory {

    private final Factory factory;
    private final ItemFactory itemFactory;
    private final AttireFactory attireFactory;

    public AbstractEntityItemAndAttireFactory(Factory factory,ItemFactory itemFactory,
                                              AttireFactory attireFactory){
        this.factory = factory;
        this.itemFactory = itemFactory;
        this.attireFactory = attireFactory;
    }

    // Getters
    public Factory getFactory() {
        return factory;
    }

    public ItemFactory getItemFactory() {
        return itemFactory;
    }

    public AttireFactory getAttireFactory() {
        return attireFactory;
    }

    /* createEntity - Abstract so that items entity is equiped with can
       be specified in subclasses.*/
    public abstract Entity createEntity(String entityKey);

    // createItem - returns Item
    public abstract Item createItem(String itemKey);

    public abstract Attire createAttire(String attireKey);

}





/*
private Factory entityFactory;
    private ItemFactory itemFactory;
    private AttireFactory attireFactory
 */