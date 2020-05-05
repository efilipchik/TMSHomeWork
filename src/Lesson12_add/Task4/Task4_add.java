package Lesson12_add.Task4;

import java.io.*;

public class Task4_add {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Car car = new Car("Mazda", 150, 20.500);

        FileOutputStream outputStream = new FileOutputStream("car.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(car);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("car.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car car1 = (Car) objectInputStream.readObject();
        System.out.println(car1);

    }
}
