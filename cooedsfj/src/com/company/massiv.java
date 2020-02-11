package com.company;

import java.util.Scanner;

public class massiv {
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
        int all = all(array);
        System.out.println("Сумма всех чисел: " + all);
        int sred = sred(array);
        System.out.println("Среднее арифметическое чисел: " + sred);
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

    public static int all(int[] array) {

        int summ = 0;

        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        return summ;
    }

    public static int sred(int[] array) {

        int sred = 0;

        for (int i = 0; i < array.length; i++) {
            sred += array[i];
        }
        return sred / array.length;
    }
}
