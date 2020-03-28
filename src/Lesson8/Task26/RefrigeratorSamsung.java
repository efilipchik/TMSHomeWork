package Lesson8.Task26;

public class RefrigeratorSamsung extends Refrigerator{

    private String mark = "Холодильник Samsung";
    private String color = "Белый";

    public void description(){
        System.out.println(mark);
        super.description();
        System.out.println("Цвет " + color);
    }
}