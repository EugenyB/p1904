package factory.rare;

import factory.AbstractFactory;
import factory.Chair;
import factory.Sofa;

public class RareFactory extends AbstractFactory {
    @Override
    public RareSofa createSofa() {
        return new RareSofa();
    }

    @Override
    public RareChair createChair() {
        return new RareChair();
    }
}
