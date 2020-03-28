package Lesson8_add.Interfaces.Robot;

import Lesson8_add.Interfaces.Robot.Hands.SamsungHand;
import Lesson8_add.Interfaces.Robot.Hands.SonyHand;
import Lesson8_add.Interfaces.Robot.Hands.ToshibaHand;
import Lesson8_add.Interfaces.Robot.Heads.SamsungHead;
import Lesson8_add.Interfaces.Robot.Heads.SonyHead;
import Lesson8_add.Interfaces.Robot.Heads.ToshibaHead;
import Lesson8_add.Interfaces.Robot.Legs.SamsungLeg;
import Lesson8_add.Interfaces.Robot.Legs.SonyLeg;
import Lesson8_add.Interfaces.Robot.Legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot Robot1 = new Robot(new SonyHead(3000), new SamsungHand(4000), new SonyLeg(2000));
        Robot Robot2 = new Robot(new SamsungHead(5000), new ToshibaHand(2000), new ToshibaLeg(1000));
        Robot Robot3 = new Robot(new ToshibaHead(2000), new ToshibaHand(2000), new SamsungLeg(3000));

        System.out.println("Робот 1");
        System.out.println("Стоимость - " + Robot1.getPrice());
        Robot1.action();
        System.out.println();
        System.out.println("Робот 2");
        System.out.println("Стоимость - " + Robot2.getPrice());
        Robot2.action();
        System.out.println();
        System.out.println("Робот 3");
        System.out.println("Стоимость - " + Robot3.getPrice());
        Robot3.action();
        System.out.println();


        Robot[] arr = new Robot[]{Robot1, Robot2, Robot3};
        int maxPrice = 0;
        int RobotMaxPrice = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice() > maxPrice) {
                maxPrice = arr[i].getPrice();
                RobotMaxPrice = i + 1;
            }

        }
        System.out.println("Самый дорогой робот - Robot" + RobotMaxPrice);
    }
}