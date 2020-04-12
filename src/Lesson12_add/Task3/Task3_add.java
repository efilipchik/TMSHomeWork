package Lesson12_add.Task3;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3_add {
    public static void main(String[] args) throws IOException {

        TextFormat tf = new TextFormat();

        BufferedReader fileReader = new BufferedReader(new FileReader("Text7.txt"));
        String str = fileReader.readLine();

        BufferedReader fileReader1 = new BufferedReader(new FileReader("Text8.txt"));
        String str1 = fileReader1.readLine();

        ArrayList<String> myList1 = new ArrayList<>(str1.length());
        tf.lineDivision(str1, myList1);

        try {
            Matcher matcher = Pattern.compile("([^.!?]+)").matcher(str);
            int count = 0;
            while (matcher.find()) {

                ArrayList<String> myList = new ArrayList<String>(matcher.group().length());
                tf.lineDivision(matcher.group(), myList);

                for (int i = 0; i < myList.size(); i++) {
                    for (int j = 0; j < myList1.size(); j++)
                        if (myList.get(i).equals(myList1.get(j)) == true) {
                            System.out.println("Предложение не прошедшее проверку " + matcher.group());
                            count++;
                            break;
                        }
                }
            }
            if (count > 0) {
                System.out.println("Текст не прошёл проверку");
            }
            else {
                System.out.println("Текст прошёл проверку");
            }
            System.out.println("Количество предложений не прошедших проверку " + count);
        } catch (NullPointerException e) {
        }
    }
}