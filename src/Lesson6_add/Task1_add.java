package Lesson6_add;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1_add {
    /**Вырезать подстроку из строки начиная с первого вхождения символа на произвольной позиции  до последнего
     вхождения другого символа на произвольной позиции. Первый символ должен быть выбран рандомно из первой
     половины предложения, второй - из второй. Если символы совпадают, генерировать пары, пока символы не будут различны.
     */
    public static void main(String[] args) {
//        String str = new String("Java Java Java");

        String str = "Java Java Java";
        int a = 0;
        int b = 0;

        while (a == b){
            a = (int) (Math.random() * ((str.length() / 2) + 1));
            b = (int) (8+Math.random() * ((str.length() / 2) + 1));
        }

        System.out.println(str.substring(a, b));

    }
}
