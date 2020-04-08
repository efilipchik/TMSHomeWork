package Lesson8_add.Interfaces.Spaceport;

public class Spaceport {

    public void launch(IStart startShuttle) {
        if (startShuttle.preLaunchSystemCheck() == false) {
            System.out.println("Предстартовая проверка провалена");
        }
        else {
            startShuttle.engineStarting();
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
            startShuttle.start();
        }
    }

}
