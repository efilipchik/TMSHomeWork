package Lesson12_add.Task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class TextFormat {

    public void lineDivision(String str, ArrayList<String> myList) {

        String[] words = str.split(" ");
        for(String s: words) {
            myList.add(s);
        }
        myList.removeAll(Arrays.asList("", null));
    }
}
