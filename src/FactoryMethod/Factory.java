package FactoryMethod;

import Entities.Entity;

public abstract class Factory {

    public Entity spawnEntity(String entityName){
        Entity ent;
        ent = createEntity(entityName);

        return ent;
    }

    public abstract Entity createEntity(String entityName);

}
