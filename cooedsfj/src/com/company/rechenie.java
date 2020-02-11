package com.company;

import java.util.Scanner;

public class rechenie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первую сторону: ");
        double side1 = sc.nextDouble();
        System.out.print("Введите вторую сторону: ");
        double side2 = sc.nextDouble();

        Rectangle rectangle = new Rectangle();

        double result1 = rectangle.areaCalculator(side1, side2);
        System.out.println("Площадь: " + result1);
        double result2 = rectangle.perimeterCalculator(side1, side2);
        System.out.println("Периметр: " + result2);
    }
}
