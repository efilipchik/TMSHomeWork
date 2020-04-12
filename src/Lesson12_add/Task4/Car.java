package Lesson12_add.Task4;

import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 1;

    private String mark;
    private int speed;
    private double price;

    public Car(String mark, int speed, double price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public int getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
