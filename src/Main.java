import SimpleFactory.SimpleFactory;
import Mains.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world");

        SimpleFactory factory = new SimpleFactory();

        factory.createMonster("goblin");

        RyansMain.run();

    }

}
