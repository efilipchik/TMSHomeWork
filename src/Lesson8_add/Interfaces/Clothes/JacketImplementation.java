package Lesson8_add.Interfaces.Clothes;

public class JacketImplementation implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Надеть куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять куртку");
    }
}
