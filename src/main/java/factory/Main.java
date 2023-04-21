package factory;

import factory.rare.RareFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new RareFactory();
        Chair chair = factory.createChair();
        chair.printChair();
        factory.createSofa().printSofa();
    }
}
