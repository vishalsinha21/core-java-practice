package pattern.factory;

import java.util.List;

import static java.util.Arrays.asList;
import static pattern.factory.ShapeFactory.getShape;

public class TestFactoryPattern {

    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("rectangle");
        shape3.draw();

        List<Shape> shapes = asList(getShape("circle"), getShape("square"), getShape("rectangle"));
        shapes.forEach(Shape::draw);
    }
    
}
