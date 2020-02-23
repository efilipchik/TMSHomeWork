package Lesson3;

public class Task11 {
    /**
     Имеется целое число, определить является ли это число простым, т.е.
     делится без остатка только на 1 и себя.
     */
    public static void main(String[] args) {
        int a = 1;
        double b = Math.sqrt(a);
        b = Math.round(b);
        int c = (int) b;
        int d = 0;

        for (int i = 2; i <= c; i++) {
            d = a % i;
            if (d != 0){
                System.out.println("Число простое");
            }else {
                System.out.println("Число не простое");
            }
        }
        if (a == 1 | a == 2){
            System.out.println("Число простое");
        }
    }
}