package hol.troll.poll;


import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0, "Dog");
        animals.add(1, "Cat");
        animals.add(2, "Cow");
        animals.add(3, "Rat");
        animals.add(4, "Parrot");
        animals.add(5, "Crocodile");
        animals.add(6, "Bird");
        animals.add(7, "Monkey");
        animals.add(8, "Tiger");
        System.out.println(animals);

        animals.set(6, "fkng bird");

        animals.remove(7);
        animals.remove(5);
        animals.remove(3);
        System.out.println(animals);

        System.out.println("Размер: " + animals.size());

        for(String item : animals) {
            System.out.println(item);
        }

            int[] array = {1, 7, 2, 9, 6};

            System.out.println(Arrays.binarySearch(array, 8));
    }
}
