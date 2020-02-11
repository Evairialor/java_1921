package com.company;


public class Rectangle {
    private double side1;
    private double side2;

    public  double areaCalculator(double side1, double side2) {
         double result1 = 2 * (side1 + side2);
         return result1;
    }

    public  double perimeterCalculator(double side1, double side2) {
        double result2 = side1 * side2;
        return result2;
    }
}

