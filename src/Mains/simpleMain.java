package Mains;

//Made by Hunter Allen

import Entities.Entity;
import SimpleFactory.SimpleFactory;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class simpleMain {

    Scanner scan;

    public simpleMain(){
        //Just a test
        System.out.println("Welcome to the simple factory!\n");

        monsterMaker();

    }

    private void monsterMaker(){
        SimpleFactory factory = new SimpleFactory();
        Scanner scan = new Scanner(System.in);
        String user = "exit";
        Entity enemy;

        System.out.println("Enemies that you can make:");
        listNames();
        System.out.println("\nType exit to exit.");

        do {

            System.out.println("Type in an enemy name to that you want the factory to make:");
            user = scan.nextLine().toLowerCase();
            enemy = factory.createMonster(user);
            //System.out.println("You typed: "+user);

        }
        while(!user.equals("exit"));

        System.out.println("Goodbye");
    }

    //Will list the name of the entity names
    private void listNames(){
        String names [];

        //Gets the location of the java directory
        String file = new File("").getAbsolutePath();
        //System.out.println(file);

        //gets the name of the files in Entities
        names = new File(file+"\\src\\Entities").list();

        //List all the names except of Entity
        for (String name: names) {
            if(!name.equals("Entity")) {
                System.out.println(name.substring(0,name.indexOf('.')));
            }
        }

    }

}
