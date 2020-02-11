package abst.cl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        int index = 0;
        while (index <= 5) {
            list.add(reader.readLine());
            index++;
        }
        List<String> stringlist = doubleValies(list);
        stringlist.stream().forEach(v -> System.out.print(String.format(" %s ", v)));
    }

    private static List<String> doubleValies(List<String> list) {
        List<String> newList = new ArrayList<>();
        newList.addAll(list);
        newList.addAll(list);
        sort(newList);
        return newList;
    }
}