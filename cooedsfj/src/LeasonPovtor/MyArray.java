package LeasonPovtor;

import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите X :");
        int x = sc.nextInt();
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
        }


        System.out.println("Введите Y :");
        int y = sc.nextInt();
        for (int i = 0; y > array.length; i++) {

        }

    }


    public static int min(int[] array) {
        int min1 = 0, min2 = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[1] < array[min1]) {
                min1 = i;

                if (array[i] < array[min2]) {
                    min2 = i;
                }
            } else {

            }

        }

        return min1;

    }
}

