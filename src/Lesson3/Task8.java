package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    /**
     Имеется целое число (задать с помощью Random rand = new Random(); int x =
     rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
     нему слово «рублей» в правильном падеже.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        int y = x % 10;

        if (y == 1 | y == -1){
            System.out.println(y + " рубль");
        }else {
            if (y > 1 & y < 5) {
                System.out.println(y + " рубля");
            } else {
                if (y < -1 & y > -5) {
                    System.out.println(y + " рубля");
                } else {
                    System.out.println(y + " рублей");
                }


            }
        }

    }
}