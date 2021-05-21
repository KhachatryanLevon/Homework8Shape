package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        int doubleRadius = 0;

        while (choose != 1 && choose != 2 && choose != 3) {
            System.out.println("If you want to calculate the area and perimeter of a circle press 1");
            System.out.println("If you want to calculate the area and perimeter of a square press 2");
            System.out.println("If you want to exit press 3");
            choose = scanner.nextInt();
        }
        if (choose == 1) {
            Circle circle = new Circle();
            System.out.println("Enter the diameter of the circle");
            doubleRadius = scanner.nextInt();
            System.out.println("The area of circle is " + circle.getArea(doubleRadius));
            System.out.println("The perimeter of circle is " + circle.getPerimeter(doubleRadius));

        } else if (choose == 2) {
            Square square = new Square();
            System.out.println("Enter the diameter of the circle around the square");
            doubleRadius = scanner.nextInt();
            System.out.println("The area of square is " + square.getArea(doubleRadius));
            System.out.println("The perimeter of square is " + square.getPerimeter(doubleRadius));
        }
    }
}

