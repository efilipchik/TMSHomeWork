package Lesson8_add.AbstractClasses;

public class Civil extends Air {
    private int numberOfPassengers;
    private boolean businessClass;
    int passengers = 100;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void loadingByPassengers() {
        if (numberOfPassengers >= passengers) {
            System.out.println("Самолёт загружен");
        }
        else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }

    public String toString() {
        return super.toString() + "количество пассажиров - " + numberOfPassengers + ", " + "наличие бизнескласса - " + businessClass;
    }
}
