package Lesson8_add.Interfaces.Spaceport;

public class Run {
    public static void main(String[] args) {

        IStart shuttle = new Shuttle();
        IStart spaceX = new SpaceX();
        IStart spaceShip = new SpaceShip();

        Spaceport spaceport = new Spaceport();

        spaceport.launch(shuttle);
        spaceport.launch(spaceX);
        spaceport.launch(spaceShip);
    }
}