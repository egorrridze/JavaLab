package com.company;

public class Ball {
    private String color;
    private int radius;

    public Ball(String c, int r) {
        this.color = c;
        this.radius = r;
    }

    public Ball(String c) {
        this.color = c;
        this.radius = 0;
    }

    public Ball(int r) {
        this.color = "red";
        this.radius = r;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void play() {
        System.out.println("That was a good game");
    }

    public String toString() {
        return this.color + ", R = " + this.radius;
    }
}
