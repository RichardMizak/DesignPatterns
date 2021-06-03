package mizak.patterns.AB;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean threeD) {
        if (threeD) {
            return new ShapeFactory3D();
        } else {
            return new ShapeFactory();
        }
    }
}
