package Lesson12.Task35;

import java.io.*;
import java.util.Random;

public class Task35 {
    public static void main(String[] args) throws IOException {

        File myFile = new File("D:/TMS/Text2.txt");
        myFile.createNewFile();

        Random rand = new Random();
        double summ = 0;
        double count = 0;

        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Text2.txt")));
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        for (int i = 0; i < 20; i++) {
            Integer r = rand.nextInt(20);
            dataOutputStream.writeInt(r);
            summ = summ + r;
            count++;
        }
        dataOutputStream.close();

        DataInputStream dataInputStream;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("Text2.txt")));
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        int res = dataInputStream.readInt();
        while (true) {
            System.out.println(res);
            try {
                res = dataInputStream.readInt();
            }catch (EOFException e) {
                break;
            }
        }
        if (dataInputStream != null) {
            dataInputStream.close();
        }
        System.out.println("Среднее арифметическое " + summ/count);
    }
}
