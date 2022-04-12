import Entities.Entity;
import FactoryMethod.Factory;
import FactoryMethod.FantasyFactory;
import FactoryMethod.FpsFactory;
import SimpleFactory.SimpleFactory;

public class Main {

    public static void main(String[] args) {

        //Simple Factory
        //SimpleFactory simpleFactory = new SimpleFactory();
        //simpleFactory.createMonster("goblin");

        //Factory Method
        Factory fantasyFactory = new FantasyFactory();
        Factory fpsFactory = new FpsFactory();

        Entity ent1 = fantasyFactory.spawnEntity("troll");
        Entity ent2 = fpsFactory.spawnEntity("shotgunner");

        System.out.println(ent1.toString());
        System.out.println(ent2.toString());

    }

}
