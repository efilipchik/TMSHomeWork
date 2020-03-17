package Lesson3_add;

public class Task3 {
    /**
     Вычислить: 1+2+4+8+...+256
     */
    public static void main(String[] args) {
        int a = 0;

        for (int i = 0; i <= 256; i++) {
            a = a + i;
        }
        System.out.println(a);
    }

}