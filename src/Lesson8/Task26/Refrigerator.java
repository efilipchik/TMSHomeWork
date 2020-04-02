package Lesson8.Task26;

public class Refrigerator extends Appliances {

    private int cameras = 2;
    private int compressors = 1;

    public void description(){
        System.out.println("Количество камер " + cameras);
        System.out.println("Количество компрессоров " + compressors);
    }

    @Override
    public void turnOn() {
        System.out.println("Включить в розетку");
    }

}
