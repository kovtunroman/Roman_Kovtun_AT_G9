package classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionSpeedCounter {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("Mama Mila Ramu" + i);
        }
        System.out.println("Array List speed is " + (System.currentTimeMillis() - t0));

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add("Mama Mila Ramu" + i);
        }
        System.out.println("Linked List speed is " + (System.currentTimeMillis() - t1));
    }
}
