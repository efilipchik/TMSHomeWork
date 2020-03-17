package Lesson3_add;

public class Task2 {
    /**
     Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
     */
    public static void main(String[] args) {
        int a = 1;

        for (int i = 0; i < 24; i = i + 3) {
            a = a * 2;
        }
        System.out.println(a);
    }

}