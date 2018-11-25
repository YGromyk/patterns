package com.gromyk.learning.bridge;

public class Circle extends Shape {
    private int x, y, radius;

    Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.y = y;
        this.x = x;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(x, y, radius);
    }
}
