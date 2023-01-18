package org.example.var23;

public class CircleFactory implements ShapeFactory{

    @Override
    public Shape createShape() {
        return new Circle(5);
    }
}
