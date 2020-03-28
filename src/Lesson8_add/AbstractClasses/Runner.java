package Lesson8_add.AbstractClasses;

import javafx.scene.control.SplitPane;

public class Runner {
    public static void main(String[] args) {

        Passenger Audi = new Passenger();
        Cargo Scania = new Cargo();
        Civil Boeing = new Civil();
        Military Lockheed = new Military();

        Audi.setPower(280);
        Audi.setTopSpeed(250);
        Audi.setWeight(2700);
        Audi.setMark("Audi");
        Audi.setNumberOfWheels(4);
        Audi.setFuelConsumption(5.8);
        Audi.setBodyType("Седан");
        Audi.setNumberOfPassengers(4);

        System.out.println(Audi);
        System.out.println();

        Scania.setPower(420);
        Scania.setTopSpeed(90);
        Scania.setWeight(18000);
        Scania.setMark("Scania");
        Scania.setNumberOfWheels(8);
        Scania.setFuelConsumption(5.8);
        Scania.setCarryingCapacity(30);

        System.out.println(Scania);
        Scania.cargoLoading();
        System.out.println();

        Boeing.setPower(90000);
        Boeing.setTopSpeed(800);
        Boeing.setWeight(44000);
        Boeing.setMark("Boeing");
        Boeing.setWingsPan(28.35);
        Boeing.setMinimumStrip(1200);
        Boeing.setNumberOfPassengers(103);
        Boeing.setBusinessClass(true);

        System.out.println(Boeing);
        Boeing.loadingByPassengers();
        System.out.println();

        Lockheed.setPower(30000);
        Lockheed.setTopSpeed(970);
        Lockheed.setWeight(23600);
        Lockheed.setMark("Lockheed");
        Lockheed.setWingsPan(13.30);
        Lockheed.setMinimumStrip(700);
        Lockheed.setBailoutSystem(true);
        Lockheed.setNumberOfRockets(10);

        System.out.println(Lockheed);
        Lockheed.rocketUse();
        Lockheed.useOfBailouts();

    }
}