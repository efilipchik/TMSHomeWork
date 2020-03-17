package Lesson6;

public class Runner25 {
    public static void main(String[] args) {
        Task25 atm = new Task25(10, 15, 20);

        atm.PutMoney100(5);
        atm.PutMoney50(10);
        atm.PutMoney20(20);

        atm.AddingMoney();
    }
}
