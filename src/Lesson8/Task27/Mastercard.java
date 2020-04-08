package Lesson8.Task27;

public class Mastercard extends Cards{

    public void forEurope() {
        System.out.println("For Europe");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Снять деньги с карты");
    }

    @Override
    public void putMoney() {
        System.out.println("Положить деньги на карту");
    }
}
