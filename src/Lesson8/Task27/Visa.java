package Lesson8.Task27;

public class Visa extends Cards {

    public void forUSA() {
        System.out.println("For USA");
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