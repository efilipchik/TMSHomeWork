package Lesson8_add.Interfaces.Robot.Legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Делает шаг Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}