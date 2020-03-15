package Lesson3;

public class Task15 {
    /**
     * Создать массив, заполнить его случайными элементами, распечатать,
     * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
     * еще один массив).
     */
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 9, 2, 5, 4};
        int reverse;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("\n");

        for (int i = 0; i < arr.length / 2; i++) {
            reverse = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i -1] = reverse;
        }

        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);

        }

    }
}