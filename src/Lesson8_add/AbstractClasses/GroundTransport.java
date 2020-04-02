package Lesson8_add.AbstractClasses;

public class GroundTransport extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    public String toString() {
        return super.toString() + "количество колёс - " + numberOfWheels + ", " + "расход топлива - " + fuelConsumption + " л/100 км, ";
    }

}