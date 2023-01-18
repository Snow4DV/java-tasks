package org.example.var23;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        ShapeFactory rectangleFactory = new RectangleFactory();
        shapes.add(rectangleFactory.createShape());
        shapes.add(new SquareFactory().createShape());
        shapes.add(new CircleFactory().createShape());

        for (Shape shape :
                shapes) {
            shape.render();
        }
    }
}
