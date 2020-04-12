package Lesson10.Task32;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task32 {
    public static void main(String args[]) {
        String str = "Java  осень Java   улетают на юг. ";
        String[] words = str.split(" ");
        Random rand = new Random();
        Integer r = rand.nextInt(10);
        HashMap<Integer, String> hMap = new HashMap<>();
        String a;
        String b = "";
//        int count = 0;
        boolean check = false;

        int wSize = words.length;
        for (int i = 0; i < wSize; i++)
            if (words[i] != " " && !"".equals(words[i])){
                hMap.put(r, words[i]);
//                System.out.println(hMap);
                for (Map.Entry entry: hMap.entrySet()) {
                    a = (String) entry.getValue();
                    System.out.println("Слово " + a);
                    if (!check) {
                        b = a;
                        check = true;
                    }
                    int count = 1;
                    if (a.equals(b)) {
                        count++;
                    }
                    System.out.println("Количество " + count);
                }
            }
    }
}