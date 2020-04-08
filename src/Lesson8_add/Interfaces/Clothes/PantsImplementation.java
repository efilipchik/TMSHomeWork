package Lesson8_add.Interfaces.Clothes;

public class PantsImplementation implements Pants {

    @Override
    public void putOn() {
        System.out.println("Надеть штаны");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны");
    }
}
