package Lesson3;

public class Task13 {
    /**
     Создать последовательность случайных чисел, найти и вывести наибольшее
     из них.
     */
    public static void main(String[] args) {
        int[] arr = {8, 3, 7, 2, 5, 1, 4};
        int j = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (j < arr[i]) {
                j = arr[i];

            }

        }
        System.out.println(j);
    }
}