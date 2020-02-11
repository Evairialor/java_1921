package com.company;

public class metodi {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            metodi obj = new metodi();
            main();
        }
    }

    public static void main() {
        System.out.println("it's usual main method without String[] args!");
    }
}
