package Lesson12_add.Task1;

import java.io.*;

public class Task1_add {
    public static <b, e> void main(String[] args) throws IOException {
        File meFile = new File("D:/TMS/Text4.txt");
        meFile.createNewFile();

        BufferedReader fileReader = new BufferedReader(new FileReader("Text3.txt"));
        String str1 = fileReader.readLine();

        try {
            try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter("D:/TMS/Text4.txt"))) {
                while (str1 != null) {
                    str1 = fileReader.readLine();
                    String[] words = str1.split("\n");
                    int wSize = words.length;
                    for (int i = 0; i < wSize; i++) {
                        if (words[i] != "\n" && !"".equals(words[i])) {
                            String a = words[i];
                            String b = new StringBuffer(a).reverse().toString();
                            if(a.equals(b)) {
                                fileWriter.write(b + "\n");
                            }
                        }
                    }
                }
            }

        } catch (NullPointerException e) {

        }
        fileReader.close();
    }
}
