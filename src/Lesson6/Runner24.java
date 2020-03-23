package Lesson6;

public class Runner24 {
    public static void main(String[] args) {
        Task24 TimeInterval = new Task24(23, 42, 8);
        Task24 TimeInterval2 = new Task24(26692);

        TimeInterval.result();
        TimeInterval2.result();
        System.out.println("Результат сравнения TimeInterval и TimeInterval2 " + TimeInterval.compareObject(TimeInterval2));

    }
}
