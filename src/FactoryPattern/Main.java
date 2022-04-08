package FactoryPattern;

import Entities.Factory;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world");

        Factory factory = new Factory();

        factory.createMonster("goblin");

    }

}
