package Lesson3;

public class Task14 {
    /**
     Создать массив оценок произвольной длины, вывести максимальную и
     минимальную оценку, её (их) номера.
     */
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 9, 1, 4};
        int j = arr[0];
        int c = arr[0];
        int z = 0;
        int x = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (j < arr[i]) {
                j = arr[i];
                z = i;
            }
            if (c > arr[i]) {
                c = arr[i];
                x = i;
            }
        }
        System.out.println("Максимальная оценка равна " + j);
        System.out.println("Её номер " + z);

        System.out.println("Минимальная оценка равна " + c);
        System.out.println("Её номер " + x);


    }
}