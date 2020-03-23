package Lesson5;

public class Task19 {
    /**Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
     учесть, что слова могут разделяться несколькими пробелами, в начале и конце
     текста также могут быть пробелы, но могут и отсутствовать.
     */
    public static void main(String args[]) {
        String str = "Каждую  осень птицы   улетают на юг. ";
        String[] words = str.split(" ");

        int Count = 0;
        int wSize = words.length;
        for (int i = 0; i < wSize; i++)
            if (words[i] != " " && !"".equals(words[i])){
                Count++;
            }

        System.out.println("Количество слов в строке = " + Count);

    }
}
