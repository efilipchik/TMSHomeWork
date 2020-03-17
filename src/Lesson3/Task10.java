package Lesson3;

public class Task10 {
    /**
     Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
     */
    public static void main(String[] args) {
        int x = 12;
        int y = 1;

        for (int i = 1; i <= x; i++) {
            y*=i;

        }
        System.out.println("Факториал числа " + x + " равен " + y);
    }
}