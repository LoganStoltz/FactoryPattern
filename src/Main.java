import Entities.Entity;
import FactoryMethod.Factory;
import FactoryMethod.FantasyFactory;
import FactoryMethod.FpsFactory;
import Mains.factoryMethodMain;
import SimpleFactory.SimpleFactory;

public class Main {

    public static void main(String[] args) {

        //Simple Factory
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.createMonster("goblin");

        //Factory Method
        factoryMethodMain factoryMethod = new factoryMethodMain();
        factoryMethod.presentFactory();

    }

}
