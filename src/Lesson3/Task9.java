package Lesson3;

public class Task9 {
    /**
     Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
     произведение, т.е. факториал числа.
     */
    public static void main(String[] args) {
        int x = (int)(Math.random() * 20);
        int y = 1;

        for (int i = 1; i <= x; i++) {
            y*=i;

        }
        System.out.println("Факториал числа " + x + " равен " + y);
    }
}