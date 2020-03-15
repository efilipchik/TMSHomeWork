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
//        Random rand = new Random();
//        int x = rand.nextInt();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = x % 10;
        int z = x % 100;

        if (y == 1 && z < 10){
            System.out.println(x + " рубль");
        }
        if (y >= 2 && y <= 4 && z < 10){
            System.out.println(x + " рубля");
        }
        if (y >= 5 && y <= 9 && z < 10 || y == 0){
            System.out.println(x + " рублей");
        }
        if (z >= 11 && z <= 19){
            System.out.println(x + " рублей");
        }
        if (z >= 21 && y == 1){
            System.out.println(x + " рубль");
        }
        if (z >= 21 && y >= 2 && y <= 4){
            System.out.println(x + " рубля");
        }
        if (z >= 21 && y >= 5 && y <= 9){
            System.out.println(x + " рублей");
        }


            }
        }


