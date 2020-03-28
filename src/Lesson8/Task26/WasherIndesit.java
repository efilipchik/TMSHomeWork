package Lesson8.Task26;

public class WasherIndesit extends Washer{

    private String mark = "Стиральная машина Indesit";
    private String color = "Серебристый";

    public void description(){
        System.out.println(mark);
        super.description();
        System.out.println("Цвет " + color);
    }
}
