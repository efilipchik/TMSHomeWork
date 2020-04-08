package Lesson8_add.Interfaces.Clothes;

public class ShoesImplementation implements Shoes {

    @Override
    public void putOn() {
        System.out.println("Надеть обувь");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять обувь");
    }
}
