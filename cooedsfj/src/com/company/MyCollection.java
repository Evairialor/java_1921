package com.company;

public class MyCollection {
    String[] arr = new String[3];
    int index = 0;
    int selector = 0;

    public boolean add(String element) {
        if (arr.length > index) {
            arr[index++] = element;
            return true;
        } else {
            return false;
        }
    }

    public String next() {
        return arr[selector++];
    }

    public boolean hasNext() {
        if (selector < arr.length) {
            return true;
        } else {
            return false;
        }
    }
}

class rezultat {
    public static void main(String[] args) {
        MyCollection m = new MyCollection();
        m.add("3543");
        m.add("321");
        m.add("12");
        while(m.hasNext()) {
            System.out.println(m.next());
        }
    }
}
