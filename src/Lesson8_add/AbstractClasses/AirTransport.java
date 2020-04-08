package Lesson8_add.AbstractClasses;

public class AirTransport extends Transport {
    private double wingsPan;
    private int minimumStrip;

    public double getWingsPan() {
        return wingsPan;
    }

    public void setWingsPan(double wingsPan) {
        this.wingsPan = wingsPan;
    }

    public int getMinimumStrip() {
        return minimumStrip;
    }

    public void setMinimumStrip(int minimumStrip) {
        this.minimumStrip = minimumStrip;
    }

    public String toString() {
        return super.toString() + "размах крыльев - " + wingsPan + " м, " + "минимальная длина взлётно-посадочной полосы для взлёта  - " + minimumStrip + " м, ";
    }
}