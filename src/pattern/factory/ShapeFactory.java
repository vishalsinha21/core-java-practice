package pattern.factory;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            throw new IllegalArgumentException("not a valid shape type");
        } else if (shapeType.equals("circle")) {
            return new Circle();
        } else if (shapeType.equals("square")) {
            return new Square();
        } else if (shapeType.equals("rectangle")) {
            return new Rectangle();
        } else {
            throw new IllegalArgumentException("not a valid shape type");
        }

    }
}
