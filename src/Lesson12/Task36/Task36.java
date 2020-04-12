package Lesson12.Task36;

import java.io.File;

public class Task36 {
    public static void main(String[] args) {

        File myFile = new File("D:/TMS");

        if (myFile.isDirectory()) {
            for (File item: myFile.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + " \t folder");
                }
                else {
                    System.out.println(item.getName() + " \t file");
                }
            }
        }

    }
}
