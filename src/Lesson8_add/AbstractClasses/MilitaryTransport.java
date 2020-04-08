package Lesson8_add.AbstractClasses;

public class MilitaryTransport extends AirTransport {
    private boolean bailoutSystem;
    private int numberOfRockets;

    public boolean getBailoutSystem() {
        return bailoutSystem;
    }

    public void setBailoutSystem(boolean bailoutSystem) {
        this.bailoutSystem = bailoutSystem;
    }

    public int getNumberOfRockets() {
        return numberOfRockets;
    }

    public void setNumberOfRockets(int numberOfRockets) {
        this.numberOfRockets = numberOfRockets;
    }

    public void rocketUse() {
        if (numberOfRockets != 0) {
            System.out.println("Ракета пошла");
        }
        else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void useOfBailouts() {
        if (bailoutSystem) {
            System.out.println("Катапультирование прошло успешно");
        }
        else {
            System.out.println("У вас нет такой системы");
        }
    }

    public String toString() {
        return super.toString() + "наличие системы катапультирования - " + bailoutSystem + ", " + "количество ракет на борту - " + numberOfRockets;
    }
}
