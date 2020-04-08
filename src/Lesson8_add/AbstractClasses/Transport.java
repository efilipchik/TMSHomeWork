package Lesson8_add.AbstractClasses;

abstract class Transport {
    private int power;
    private int topSpeed;
    private int weight;
    private String mark;

    public int getPower() {
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public  String getMark() {
        return mark;
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public double powerInKilowatts(){
        return power * 0.74;
    }

    public String toString() {
        return "Описание: " + "мощность - " + power + " л.с, " + "мощность в киловаттах - " + powerInKilowatts() + " кВ, " + "максимальная скорость - " + topSpeed + " км/ч, " + "масса " + weight + " кг, " + "марка - " + mark + ", ";
    }

}
