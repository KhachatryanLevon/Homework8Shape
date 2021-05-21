package com.company;

import java.util.Scanner;

public class Circle extends Shape {

    Scanner scanner = new Scanner(System.in);
    private int radius = 0;

    private void setRadius(int radius) {
        while (radius < 0) {
            System.out.println("Enter right radius, it cannot be negative");
            radius = scanner.nextInt();
        }
        this.radius = radius;
    }

    private int getRadius() {
        return radius;
    }

    @Override
    public double getArea(int doubleRadius) {
        setRadius(doubleRadius);
        int radius = getRadius() / 2;
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double getPerimeter(int doubleRadius) {
        setRadius(doubleRadius);
        double perimeter = Math.PI * radius;
        return perimeter;
    }
}
