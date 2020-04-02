package Lesson8.Task26;

public class Runner {
    public static void main(String[] args) {

        /**Создать иерархию классов, описывающих бытовую технику. Создать несколько
           объектов описанных классов, часть из них включить в розетку.
           Иерархия должна иметь хотя бы три уровня.
         */

        Refrigerator R = new Refrigerator();
        Washer W = new Washer();

        R.description();
        R.turnOn();
        W.description();

    }
}
