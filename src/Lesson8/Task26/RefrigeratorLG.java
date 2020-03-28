package Lesson8.Task26;

public class RefrigeratorLG extends Refrigerator{

    private String mark = "Холодильник LG";
    private String color = "Серый";

    public void description(){
        System.out.println(mark);
        super.description();
        System.out.println("Цвет " + color);
    }
}
