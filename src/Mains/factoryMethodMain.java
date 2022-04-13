package Mains;

import Entities.Entity;
import FactoryMethod.Factory;
import FactoryMethod.FantasyFactory;
import FactoryMethod.FpsFactory;

public class factoryMethodMain {

    public void presentFactory(){
        Factory fantasyFactory = new FantasyFactory();
        Factory fpsFactory = new FpsFactory();

        Entity ent1 = fantasyFactory.spawnEntity("troll");
        Entity ent2 = fpsFactory.spawnEntity("shotgunner");

        System.out.println(ent1.toString());
        System.out.println(ent2.toString());
    }


}
