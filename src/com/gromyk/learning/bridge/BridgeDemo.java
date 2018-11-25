package com.gromyk.learning.bridge;

public class BridgeDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(0,0,3, new  RedCircle());
        Shape greenCircle = new Circle(0,0,3, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
