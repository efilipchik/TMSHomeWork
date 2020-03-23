package Lesson5;

public class Task20 {
    /**Имеется строка с текстом. Вывести текст, составленный из последних букв
     всех слов.
     */
    public static void main(String args[]) {
        String str = "Каждую осень птицы улетают на юг.";
        str = str.replaceAll("[!.,:;-]", " ");
        String[] words = str.split(" ");

        int wSize = words.length;

        for (int i = 0; i < wSize; i++)
            if (words[i] != " " && !"".equals(words[i])) {

                System.out.print(words[i].toCharArray()[words[i].length() - 1]);
            }


    }
}
