package org.example.var23;

public class Rectangle extends Shape{

    private final int sideA;
    private final int sideB;

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }



    @Override
    public void render() {
        System.out.println("Rendered rectangle with sides: " + sideA + ", " + sideB);
    }
}
