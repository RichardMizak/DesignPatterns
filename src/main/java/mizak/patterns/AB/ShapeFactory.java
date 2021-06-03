package mizak.patterns.AB;

public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
