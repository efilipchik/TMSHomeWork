package Lesson8_add.Interfaces.Spaceport;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean preLaunchSystemCheck() {

        Random rand = new Random();
        int randLetter = (rand.nextInt(11));
        System.out.println("Рандомное число " + randLetter);

        if (randLetter > 3) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void engineStarting() {

        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {

        System.out.println("Старт Шатла");
    }

}