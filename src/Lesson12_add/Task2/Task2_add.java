package Lesson12_add.Task2;


import java.io.*;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_add {
    public static void main(String[] args) throws IOException {

        TextFormat tf = new TextFormat();

        File meFile = new File("D:/TMS/Text6.txt");
        meFile.createNewFile();

        BufferedReader fileReader = new BufferedReader(new FileReader("Text5.txt"));
        String str1 = fileReader.readLine();

        try {
            try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("D:/TMS/Text6.txt"))) {

                Matcher matcher = Pattern.compile("([^.!?]+[.!?])").matcher(str1);
                while (matcher.find()) {
                    if ((tf.wordCount(matcher.group()) >= 3 && tf.wordCount(matcher.group()) <= 5) ||tf.palindromes(matcher.group()) == true) {
                        fileWriter.write(matcher.group());
                    }
                }
            }

        } catch (NullPointerException e) {

        }
    }
}