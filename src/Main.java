import AbstractFactory.*;
import SimpleFactory.SimpleFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world");

        SimpleFactory factory = new SimpleFactory();

        factory.createMonster("goblin");

        RunAbstractFactory.run();

    }

}
