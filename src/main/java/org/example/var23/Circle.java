package org.example.var23;

public class Circle extends Shape{

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void render() {
        System.out.println("Rendered circle with radius " + radius);
    }
}
