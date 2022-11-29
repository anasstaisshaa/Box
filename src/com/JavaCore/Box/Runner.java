package com.JavaCore.Box;

public class Runner {
    public static void main(String[] args) {
        Ball ball = new Ball(2.5);
        Cylinder cylinder = new Cylinder(3, 1);
        Pyramid pyramid = new Pyramid(25, 25);

        Box box = new Box(750);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
    }
}
