package com;

import java.util.Scanner;

public class Calculator {
    public static int add(int user, int user2) {
        return user + user2;
    }

    public static int sub(int user, int user2) {
        return user - user2;
    }

    public static int mul(int user, int user2) {
        return user * user2;
    }

    public static int div(int user, int user2) throws Exception {
        return user / user2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое значение: ");
        int user = sc.nextInt();
        System.out.print("Введите второе значение: ");
        int user2 = sc.nextInt();
        System.out.print("Введите операцию: (+,-,*,/) ");
        String z = sc.next();
        int result, result2, result3;
        if (z.equals("+")) {
            result = add(user, user2);
            System.out.println(result);
        }
        if (z.equals("-")) {
            result2 = sub(user, user2);
            System.out.println(result2);
        }
        if (z.equals("*")) {
            result3 = mul(user, user2);
            System.out.println(result3);
        }

        try {
            double result4 = div(user, user2);
            System.out.println(result4);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        } finally {
            System.out.println("Блок finally");
        }

    }

}
