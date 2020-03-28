package Lesson8_add.AbstractClasses;

public class Cargo extends Ground {
    private int carryingCapacity;
    int amountOfCargo = 25;

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void cargoLoading() {
        if (carryingCapacity >= amountOfCargo) {
            System.out.println("Грузовик загружен");
        }
        else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public String toString() {
        return super.toString() + "грузоподъёмность - " + carryingCapacity + " т";
    }

}