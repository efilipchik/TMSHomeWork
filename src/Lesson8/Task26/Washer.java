package Lesson8.Task26;

public class Washer extends Appliances {

    private int maximumLoad = 5;

    public void description(){
        System.out.println("Максимальная загрузка " + maximumLoad + " кг");
    }

    @Override
    public void turnOn() {
        System.out.println("Включить в розетку");
    }


}
