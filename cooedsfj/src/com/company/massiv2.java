package com.company;

public class massiv2 {
    public static void main(String[] args) {
        operation();
        operation("val");
        operation("val", 10);
        operation("val", 10, 12.2);
    }

    static void operation() {
        operation("val", 10, 12.2);
    }

    static void operation(String value1) {
        operation(value1, 10, 12.2);
    }

    static void operation(String value1, int value2) {
        operation(value1, value2, 12.2);
    }

    static void operation(String value1, int value2, double value3) {
        operation(value1 + ", " + value2 + ", " + value3);
    }
}
