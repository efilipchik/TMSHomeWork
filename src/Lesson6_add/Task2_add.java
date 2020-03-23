package Lesson6_add;

public class Task2_add {
    /**Заменить все вхождения символа стоящего в позиции 3 на символ стоящий в позиции 0
     */
    public static void main(String[] args) {
        String str = new String("Java Java Java");
        char a = str.charAt(0);
        char b = str.charAt(3);
        String str2 = str.replace(b, a);
        System.out.println(str2);
    }
}
