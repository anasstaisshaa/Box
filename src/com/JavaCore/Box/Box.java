package com.JavaCore.Box;

public class Box {
    private double available;

    public Box(double available) {
        super();
        this.available = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
