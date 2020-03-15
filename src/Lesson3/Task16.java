package Lesson3;

public class Task16 {
    /**
     Определите сумму элементов одномерного массива, расположенных между
     минимальным и максимальным значениями.
     */
    public static void main(String[] args) {
        int[] arr = {8, 1, 5, 3, 6, 9, 4};
        int j = arr[0];
        int c = arr[0];
        int z = 0;
        int x = 0;
        int a = 0;


        for (int i = 0; i < arr.length-1; i++) {

            if (c > arr[i]) {
                c = arr[i];
                x = i;
            }

            if (j < arr[i]) {
                j = arr[i];
                z = i;
            }

        }

        for (int i = x+1; i < z; i++) {
            a = a + arr[i];

        }
        System.out.println(a);
    }
}