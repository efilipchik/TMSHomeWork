package Lesson8_add.Interfaces.Robot.Legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Делает шаг Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
