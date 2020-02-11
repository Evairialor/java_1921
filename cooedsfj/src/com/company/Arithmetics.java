package com.company;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите x: ");
        int x = sc.nextInt();
        System.out.print("Введите y: ");
        int y = sc.nextInt();
        System.out.print("Введите операцию: (+,-,*,/) ");
        String z = sc.next();
        int result;
        int result2;
        int result3;
        int result4;
        if (z.equals("+")) {
            result = add(x, y);
            System.out.println(result);
        }
        if (z.equals("-")) {
            result2 = Sub(x, y);
            System.out.println(result2);
        }
        if (z.equals("*")) {
            result3 = mul(x, y);
            System.out.println(result3);
        }
        if (z.equals("/")) {
            result4 = div(x, y);
            if (result4 < 0) {
                System.out.println("delit nelzy");
            } else {
                System.out.println(result4);
            }

        }
    }

    public static int add(int x, int y) {

        return x + y;

    }

    public static int Sub(int x, int y) {

        return x - y;
    }

    public static int mul(int x, int y) {

        return x * y;
    }

    public static int div(int x, int y) {
//    if (y == 0) {
//        System.out.println("Делить на ноль нельзя");
//        return 0;
//    }
//        return x / y;
//    }
        return y == 0 ? -1 : x / y;
    }
}

