package factory.modern;

import factory.AbstractFactory;

public class ModernFactory extends AbstractFactory {
    @Override
    public ModernSofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public ModernChair createChair() {
        return new ModernChair();
    }
}
