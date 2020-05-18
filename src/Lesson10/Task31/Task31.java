package Lesson10.Task31;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task31 {
    public static void main(String[] args) {
        int a = 0;

        ArrayList<Integer> arr = new ArrayList<>(10);
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {

            Integer r = rand.nextInt(10);
            arr.add(r);
        }

        System.out.println(arr);

        Iterator<Integer> myIterator = arr.iterator();
        while (myIterator.hasNext()) {
            Integer next = myIterator.next();

            if (next > a) {
                a = next;
            }
        }
        System.out.println(a);

    }
}