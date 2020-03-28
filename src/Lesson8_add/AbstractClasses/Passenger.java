package Lesson8_add.AbstractClasses;

public class Passenger extends Ground {
    private String bodyType;
    private int numberOfPassengers;
    int numberOfMinutes = 30;
    int distance;
    double expense;

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType){
        this.bodyType = bodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int distanceInTime() {
        return (distance = getTopSpeed() * numberOfMinutes / 60);
    }

    private double expenseForTime() {
        return (expense = getFuelConsumption() * distance / 100);
    }

    public String toString() {
        return super.toString() + "тип кузова - " + bodyType + ", " + "количество пассажиров - " + numberOfPassengers + "\n" +
                "За время " + numberOfMinutes + " минут, автомобиль " + getMark() + " двигаясь с максимальной скоростью " + getTopSpeed() +
                " км/ч проедет " + distanceInTime() + " км и израсходует " + expenseForTime() + " литров топлива";
    }

}