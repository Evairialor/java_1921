package com.company;

import java.util.Scanner;

public class plusminus {
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

        int plus = plus(array);
        System.out.println("Сумма положительных чисел: " + plus);
        int minus = minus(array);
        System.out.println("Сумма отрицательных чисел: " + minus);
        int prost = chetn(array);
        System.out.println("Сумма простых чисел: " + prost);
    }

    public static int plus(int[] array) {

        int plus = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                plus += array[i];
            }
        }
        return plus;
    }

    public static int minus(int[] array) {

        int minus = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                minus += array[i];
            }
        }
        return minus;
    }

    public static int chetn(int[] array) {

        int chetn = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 0) && (array[i] % 2 == 0)) {
                chetn += array[i];
            }
        }
        return chetn;
    }
}

  /*  public static int prost(int[] array) {

        int prost = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = array[i]; j > 0; j--) {
                if (j % 2 == 0) {
                prost += j;
            }
        }
        return prost;  */