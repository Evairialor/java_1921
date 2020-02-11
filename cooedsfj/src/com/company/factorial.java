package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int keyboard = factorial(sc.nextInt());
        System.out.printf("Факториал равен: " + keyboard);
    }

    public static int factorial(int keyboard) {
        if (keyboard == 0) {
            return 1;
        }
        return keyboard * factorial(keyboard-1);
    }
}
