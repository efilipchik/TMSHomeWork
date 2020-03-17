package Lesson3;

public class Task7 {
    /**
     Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
     полностью закрыть круглой картонкой радиусом r.
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int r = 4;
        double d = 2 * r;
        double c = Math.sqrt(a * a + b * b);
        if (d == c || d > c){
            System.out.println("Закрыть отверстие можно");
        }
        else {
            System.out.println("Закрыть отверстие нельзя");
        }

    }
}