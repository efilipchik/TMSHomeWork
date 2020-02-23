package Lesson3_add;

public class Task1 {
    /**
     Начав тренировки, спортсмен в первый день пробежал 10 км.
     Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
     Какойсуммарный путь пробежит спортсмен за 7 дней?
     */
    public static void main(String[] args) {
        double a = 10;
        double sum = 0;

        for (double i = 0; i < 7; i++) {
            sum = sum + a;
            a = a * 1.1;
        }
        System.out.println(sum);
    }

}