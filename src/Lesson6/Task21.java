package Lesson6;

public class Task21 {
    /**Напишите три цикла выполняющих многократное сложение строк, один с
     помощью оператора сложения и String, другой с помощью StringBuilder и метода
     append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
     */
    public static void main(String[] args) {
        String str1 = "Java";
        StringBuilder str2 = new StringBuilder("Java");
        StringBuffer str3 = new StringBuffer("Java");

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            str1 = str1 + i;
        }
        System.out.println("Скорость выполнения String " + (System.currentTimeMillis()-startTime) + " миллисекунд");

        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            str2.append(i);
        }
        System.out.println("Скорость выполнения StringBuilder " + (System.currentTimeMillis()-startTime2) + " миллисекунд");

        long startTime3 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            str3.append(i);
        }
        System.out.println("Скорость выполнения StringBuffer " + (System.currentTimeMillis()-startTime3) + " миллисекунд");
    }
}
