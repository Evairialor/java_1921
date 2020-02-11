package com.company;


public class test {
    public static void main(String[] args) {
        if (args.length > 0) {
            int value = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
            System.out.println(value);
        }


//        Arrays.stream(args).forEach(x -> System.out::)
//        int result = Addition(12);
//        System.out.println(result);
    }

    public static int Addition(int parameter) {
        parameter += 1;

        return parameter;
    }
}
