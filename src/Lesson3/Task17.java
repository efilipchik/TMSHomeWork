package Lesson3;

import java.net.SocketOption;

public class Task17 {
    /**
     * Создать двухмерный квадратный массив, и заполнить его «бабочкой»
     */
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length - i; j++) {
                arr[i][j] = 1;
            }
        }
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = i; j >= arr[i].length - i - 1; j--) {
                arr[i][j] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
