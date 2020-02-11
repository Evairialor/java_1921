package com.company;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        infinity();

    }

    public static void infinity() {
        Scanner sc = new Scanner(System.in);
        boolean pulse = true;
        int x;
        while (pulse) {
            System.out.print("Введите число: ");
            x = sc.nextInt();
            if (x < 0) {
                System.out.println("число отрицательное");
            }
            if (x > 0) {
                System.out.println("число положительное");
            }
            if (x == 0) {
                break;
            }
        }
    }
}
