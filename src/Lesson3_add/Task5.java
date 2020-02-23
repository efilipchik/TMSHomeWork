package Lesson3_add;

public class Task5 {
    /**
     Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от 1 до 20 дюймов.
     1 дюйм = 2,54 см
     */
    public static void main(String[] args) {
        double a = 2.54;
        double b = 0;

        for (int i = 1; i <= 20; i++) {
            b = a * i;
            System.out.println(b);
        }
    }

}