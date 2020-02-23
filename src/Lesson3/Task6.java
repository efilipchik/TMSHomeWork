package Lesson3;

public class Task6 {
    /**
     Создайте число. Определите, является ли число трехзначным. Определите, является
     ли его последняя цифра семеркой. Определите, является ли число четным.
     */
    public static void main(String[] args) {
        int a = 5847;
        int b = a%10;
        int c = a;
        int i = 0;

        while (a != 0) {
            a = a / 10;
            i = i + 1;
        }

        if (i == 3){
            System.out.println("Число является трёхзначным");
        }else {
            System.out.println("Число не является трёхзначным");
        }

        if (b == 7){
            System.out.println("Последняя цифра числа является семёркой");
        }else {
            System.out.println("Последняя цифра числа не является семёркой");
        }

        if (c % 2 == 0){
            System.out.println("Число является чётным");
        }else {
            System.out.println("Число не является чётным");
        }

    }
}