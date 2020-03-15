package Lesson5_add;

import java.util.Random;
import java.util.Scanner;

import static Lesson5_add.Runner.*;

public class Computer {

    public static void description(){
        System.out.println("Процессор " + cpu + "\n" + "Оперативная память " + ram + "\n" + "Жёсткий диск " + ssd + "\n" + "Ресурс полных циклов работы " + cycles);
    }

    static void turnOn() {
        Random rand = new Random();
        int randLetter = (rand.nextInt(2));
        System.out.println("Рандомное число " + randLetter);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        System.out.println("Ваше число " + number);

        if (randLetter == number) {
            System.out.println("Вы угадали число, коппьютер включается");
        } else {
            System.out.println("Ваш компьютер сгорел");
            life = 0;
        }

    }

    static void turnOnExcess() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        System.out.println("Превышен ресурс полных циклов работы, компьютер сгорел");
    }

    static void turnOff() {
        Random rand = new Random();
        int randLetter = (rand.nextInt(2));
        System.out.println("Рандомное число " + randLetter);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        System.out.println("Ваше число " + number);

        if (randLetter == number) {
            System.out.println("Вы угадали число, коппьютер выключается");
        } else {
            System.out.println("Ваш компьютер сгорел");
            life = 0;
        }

    }

    static void turnOffExcess() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        System.out.println("Превышен ресурс полных циклов работы, компьютер сгорел");
    }

}