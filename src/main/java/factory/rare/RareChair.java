package factory.rare;

import factory.Chair;

public class RareChair extends Chair {
    @Override
    public void printChair() {
        System.out.println("This chair is old. Very old...");
    }
}
