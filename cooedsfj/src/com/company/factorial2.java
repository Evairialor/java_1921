package com.company;

import java.util.Scanner;

public class factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int keyboard = sc.nextInt();
        System.out.println(factorial(keyboard));
    }

    public static int factorial(int y) {
        int fact = 1;

        for (int i = 1; i <= y; i++) {
            fact *= i;
        }
        return fact;
    }
}

