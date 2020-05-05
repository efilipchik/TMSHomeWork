package Lesson12_add.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormat {

    public int wordCount(String str) {
        String[] words = str.split(" ");
        int Count = 0;
        int wSize = words.length;
        for (int i = 0; i < wSize; i++) {
            if (words[i] != " " && !"".equals(words[i])) {
                Count++;
            }
        }
        return Count;
    }

    public boolean palindromes(String str) {
        String[] words = str.split("[. ]");
        int check = 0;
        int wSize = words.length;
        for (int i = 0; i < wSize; i++) {
            if (words[i] != " " && !"".equals(words[i])) {
                String a = words[i];
                String b = new StringBuffer(a).reverse().toString();
                if (a.equalsIgnoreCase(b)) {
                    check++;
                }
            }
        }
        if (check > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
