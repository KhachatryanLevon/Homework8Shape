package com.company;

import java.util.Scanner;

public class Square extends Shape {

    Scanner scanner = new Scanner(System.in);
    private int radius = 0;

    private int getRadius() {
        return radius;
    }

    private void setRadius(int radius) {
        while (radius < 0) {
            System.out.println("Enter right radius, it cannot be negative");
            radius = scanner.nextInt();
        }
        System.out.println("Enter right radius");
    }

    @Override
    public double getPerimeter(int doubleRadius) {
        setRadius(doubleRadius);
        double perimeter = doubleRadius * 2 * Math.sqrt(2);
        return perimeter;
    }

    @Override
    public double getArea(int doubleRadius) {
        setRadius(doubleRadius);
        double area = Math.pow(doubleRadius, 2) / 2;
        return area;
    }
}
