package Lesson3_add;

public class Task4 {
    /**
     Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 0;

        for (int i = 1; i <= b; i++) {
            c = c + a;

        }
        System.out.println(c);
    }

}