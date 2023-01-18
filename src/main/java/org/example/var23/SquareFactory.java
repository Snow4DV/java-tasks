package org.example.var23;

public class SquareFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Square(6);
    }
}
