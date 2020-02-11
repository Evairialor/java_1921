package com.company;

import java.util.Scanner;

public class next {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int c = sc.nextInt();
        int[] array = new int[c];
        for (int i = 0; i < c; i++) {
            System.out.print("array[" + i + "]=");
            array[i] = sc.nextInt();
        }
        System.out.print("Полученный массив:");
        for (int i = 0; i < c; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println(" ");
        int max = max(array);
        System.out.println("Максимальное число: " + max);
        int min = min(array);
        System.out.println("Минимальное число: " + min);
        int sred = sred(array);
        System.out.println("Среднее арифметическое чисел: " + sred);
        int dobavka = dobavka(array);
        System.out.println("Смена значения array[0] - " + dobavka);
        int dobavka2 = dobavka2(array);
        System.out.println("Смена значения array[1] - " + dobavka2);
    }

    public static int max(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int sred(int[] array) {

        int sred = 0;

        for (int i = 0; i < array.length; i++) {
            sred += array[i];
        }
        return sred / array.length;
    }

    public static int dobavka(int[] array) {
        int a = 5;
        array[0] = a;
        return a;
    }

    public static int dobavka2(int[] array) {
        int b = 6;
        array[1] = b;
        return b;
    }
}
