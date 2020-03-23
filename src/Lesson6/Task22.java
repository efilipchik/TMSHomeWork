package Lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Task22 {
        /**Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
         записаных по правилам Java, с помощью регулярных выражений и вывести их на
         страницу.
         */
        public static void main(String[] args) {
            String input = "Java Java Java Java 0x7fff Java Java 0x7aaa";
            String pattern = ("0x[A-Fa-f0-9]{1,4}");
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(input);

            while (m.find()) {
                System.out.println(m.group());
            }
        }
}
