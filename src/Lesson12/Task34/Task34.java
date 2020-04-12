package Lesson12.Task34;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task34 {
    public static void main(String[] args) throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader("Text1.txt"));
        String str = fileReader.readLine();
        while (str != null) {
            System.out.println(str);

            Pattern pattern = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
            Matcher matcher = pattern.matcher(str);

            ArrayList<Integer> al = new ArrayList<>();
            Integer a = 0;
            while (matcher.find()) {
//                String s = matcher.group(0);
                if (matcher.group().replaceAll("\\D", "").length() == matcher.group().length()) {
                    al.add(Integer.parseInt(matcher.group()));
                    a =  a + (Integer.parseInt(matcher.group()));
                }

            }
            System.out.println(al);
            System.out.println("Сумма " + a);

            Set<Integer> set = new LinkedHashSet<>(al);
            List<Integer> al2 = new ArrayList<>(set);
            System.out.println(al2);

            str = fileReader.readLine();
        }

        fileReader.close();

    }

}