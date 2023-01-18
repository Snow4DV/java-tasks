package org.example.var24;

public class RationalNumberFactory implements NumberFactory{
    @Override
    public ComplexNumber create(double real, double imaginary) {
        return new RationalNumber(real);
    }
}
