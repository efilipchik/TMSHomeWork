package Lesson5_add;

public class Runner {

    public static String cpu = "Intel Core i7";
    public static String ram = "16GB";
    public static String ssd = "512GB";
    public static int cycles = 3;
    public static int life = 1;

    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.description();
        for (int i = 0; i <= cycles; i++) {
            if (life == 1) {
                myComputer.turnOn();
            }else {
                break;
            }
            if (i == cycles) {
                myComputer.turnOnExcess();
                break;
            }

            if (life == 1) {
                myComputer.turnOff();
            }else {
                break;
            }
            if (life ==1){
                if (i == cycles - 1) {
                    myComputer.turnOffExcess();
                    break;
                }
            }
        }
    }
}