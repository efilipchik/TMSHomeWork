package Lesson8_add.Interfaces.Clothes;

public class Run {
    public static void main(String[] args) {

        ManImplementation man = new ManImplementation("Вася", new JacketImplementation(), new PantsImplementation(), new  ShoesImplementation());

        man.putOnAll();
        man.takeOffAll();

    }
}
