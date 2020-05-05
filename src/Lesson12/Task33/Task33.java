package Lesson12.Task33;

import java.io.*;

public class Task33<str> {
    public Task33() throws FileNotFoundException, IOException {
    }

    public static void main(String[] args) throws IOException {

        File myFile = new File("D:/TMS/Text.txt");
        myFile.createNewFile();
        String str = "Амфибии, или земноводные, – это хордовые позвоночные холоднокровные животные, у которых в ходе эволюции появились пятипалые конечности и лёгочное дыхание для жизни на суше, но их размножение и развитие связаны с водной средой. Насчитывают около 4 тыс. видов земноводных. Их делят на три группы: бесхвостые, безногие и хвостатые.\n";
        FileOutputStream fos = new FileOutputStream("D:/TMS/Text.txt");
        PrintStream printStream = new PrintStream(fos);
        printStream.println(str);
        fos.close();


        BufferedReader fileReader = new BufferedReader(new FileReader("Text.txt"));
        String str1 = fileReader.readLine();
        while (str1 != null) {
            System.out.println(str1);

            String[] words = str1.split(" ");

            int Count = 0;
            int a = 0;
            char b;
            int wSize = words.length;
            for (int i = 0; i < wSize; i++) {
                if (words[i] != " " && !"".equals(words[i])) {
                    Count++;
                }
            }

            System.out.println("Количество слов в тексте = " + Count);

            for (int i = 0; i < str1.length(); i++) {
                b = str1.charAt(i);
                if(b == '–' || b == '(' || b == ')' || b == ',' || b == ':' || b == ';' || b == '.' || b == '«' || b == '»' || b == '!' || b == '?' || b == '…'){
                    a++;
                }

            }
            System.out.println("В тексте " + a + " знаков препинания");

            str1 = fileReader.readLine();
        }

        fileReader.close();

    }

}