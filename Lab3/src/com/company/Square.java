package com.company;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.length = side;
        super.width = side;
    }

    @Override
    public void setWidth(double width) {
        super.length = width;
        super.width = width;
    }

    @Override
    public void setLength(double length) {
        super.length = length;
        super.width = length;
    }

    @Override
    public String toString() {
        return "s = " + super.getArea() + ", p = " + super.getPerimeter();
    }
}
