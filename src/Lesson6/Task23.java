package Lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task23 {
    /**Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
     которых есть параметры, например <p id=”p1”>, и замену их на простые теги
     абзацев <p>.
     */
    public static void main(String[] args) {
        String str = "Java Java <p id = \"p1\"> Java Java <p id = \"p2\"> Java";
        Pattern pattern = Pattern.compile("<p.+?>");
        Matcher matcher = pattern.matcher(str);
        String str2 = matcher.replaceAll("<p>");


        System.out.println(str2);
    }
}
