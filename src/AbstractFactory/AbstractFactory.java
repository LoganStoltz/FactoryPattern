package AbstractFactory;

import Atire.Atire;
import Entities.Entity;
import Item.Item;

public abstract class AbstractFactory {

    public Entity createEntity;

    // Define scheme to return an instance of Entity subclass given its key.
    public abstract Entity createEntity(String entityKey);

    // Utilize a different factory subclass to return instance of Entity subclass.
    public Entity createEntity(AbstractFactory factory,String entityKey){
        return factory.createEntity(entityKey);
    }

    // Define scheme to return an instance Item subclass given its key.
    public abstract Item createItem(String itemKey);
    // Utilize a different factory subclass to return instance of Entity subclass.
    public Item createItem(AbstractFactory factory,String itemKey){
        return factory.createItem(itemKey);
    }

    // Define scheme to return an instance Item subclass given its key.
    public abstract Atire createAtire(String atireKey);
}
