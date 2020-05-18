package Lesson10.Task30;

import java.net.Inet4Address;
import java.util.*;

public class Task30 {
    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>(10);
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {

            Integer r = rand.nextInt(10);
            arr.add(r);
        }

        System.out.println(arr);

        Set<Integer> set = new  LinkedHashSet<>(arr);
        List<Integer> arr2 = new ArrayList<>(set);

        System.out.println(arr2);


    }

}
