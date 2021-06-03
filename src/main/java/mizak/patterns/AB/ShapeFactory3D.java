package mizak.patterns.AB;

public class ShapeFactory3D extends AbstractFactory{
    @Override
    Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle3D();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square3D();
        }
        return null;
    }
}
