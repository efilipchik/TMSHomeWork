package Lesson8.Task26;

public class Runner {
    public static void main(String[] args) {

        /**Создать иерархию классов, описывающих бытовую технику. Создать несколько
           объектов описанных классов, часть из них включить в розетку.
           Иерархия должна иметь хотя бы три уровня.
         */

        RefrigeratorSamsung RS = new RefrigeratorSamsung();
        RefrigeratorLG RLG = new RefrigeratorLG();
        WasherIndesit WI = new WasherIndesit();

        RS.description();
        RS.turnOn();
        RLG.description();
        RLG.turnOn();
        WI.description();

    }
}
