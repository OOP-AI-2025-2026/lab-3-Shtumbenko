package org.example.task2;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double side) {
        this(side, side, side);
    }

    public Box() {
        this(0, 0, 0);
    }

    public double calculateVolume() {
        return this.length * this.width * this.height;
    }

    public double calculateSurfaceArea() {
        return 2 * (this.length * this.width +
                this.length * this.height +
                this.width * this.height);
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
