package Lesson3;

public class Task12 {
    /**
     Найдите сумму первых n целых чисел, которые делятся на 3.
     */
    public static void main(String[] args) {
        int n = 3;
        int b = 1;
        int i = 1;
        int sum = 0;

        for (i = 1; b <= n ; i++) {
            if (i % 3 == 0){
                b++;
            }
            sum = i + i;
        }
        System.out.println(sum);
    }
}