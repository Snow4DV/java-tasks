package org.example.var23;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Rectangle(7,8);
    }
}
