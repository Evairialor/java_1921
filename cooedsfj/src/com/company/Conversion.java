package com.company;

import java.util.Scanner;

public class Conversion {


    public static void main(String[] args) {
        final int RUB_TO_USD = 3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите валюту (Р, $, Е): ");
        String x = sc.next();
        System.out.print("В какую перевести (Р, $, Е): ");
        String c = sc.next();
        System.out.print("Введите сумму ");
        int k = sc.nextInt();
        int result;
        int result2;
        int result3;
        if (c.equals("$")) {
            result = rubas(RUB_TO_USD, k);
            System.out.println(result);
        }
//        if (z.equals("$")) {
//            result2 = dollar(rubli, evr);
//            System.out.println(result2);
//        }
//        if (z.equals("Е")) {
//            result3 = evro(rubli, dollar);
//            System.out.println(result3);
//        }
    }

    public static int rubas(int RUB_TO_USD, int k) {
        return RUB_TO_USD * k;
    }

//    public static int dollar(int evr, int rubli) {
//        if () {
//
//        }
//    }
//    public static int evro(int dollar, int rubli) {
//        if () {
//
//        }
}

