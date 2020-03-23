package Lesson6;

import java.util.Scanner;

/**Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
 банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
 снимающую деньги. На вход передается сумма денег. На выход – булевское
 значение (операция удалась или нет). При снятии денег функция должна
 рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
 конструктор с тремя параметрами – количеством купюр.*/

public class Task25 {

    int oneHundred = 100;
    int fifty = 50;
    int twenty = 20;
    int qoneHundred, qfifty, qtwenty, q, w, e;
    double x, y, z, a, b, c;

    public Task25(int qoH, int qf, int qt) {
        qoneHundred = qoH;
        qfifty = qf;
        qtwenty = qt;
    }

    public void PutMoney100(int t){
        qoneHundred = qoneHundred + t;
        System.out.println("Количество 100: " + qoneHundred);
    }

    public void PutMoney50(int t){
        qfifty = qfifty + t;
        System.out.println("Количество 50: " + qfifty);
    }

    public  void PutMoney20(int t){
        qtwenty = qtwenty + t;
        System.out.println("Количество 20: " + qtwenty);
    }

    public void AddingMoney() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        System.out.println("Ваше число " + number);

        boolean t;
        if (((number % 100 % 50) % 20) == 0){
            t = true;
            System.out.println("Операция удалась.");
        }
        else {
            t = false;
            System.out.println("Операция не удалась.");
            System.exit(0);
        }

        x = number / oneHundred;
        if (x <= qoneHundred) {
            a = number % oneHundred;
            q = (int) x;
            System.out.println("Количество сторублёвых купюр: " + q);
        }
        if (x > qoneHundred) {
            a = number - (oneHundred * qoneHundred);
            System.out.println("Количество сторублёвых купюр: " + qoneHundred);
        }

        y = a / fifty;
        if (y <= qfifty) {
            b = a % fifty;
            w = (int) y;
            System.out.println("Количество пятидесятирублёвых купюр: " + w);
        }
        if (y > qfifty) {
            b = a - (fifty * qfifty);
            System.out.println("Количество сторублёвых купюр: " + qfifty);
        }

        z = b / twenty;
        if (z <= qtwenty) {
            c = b % twenty;
            e = (int) z;
            System.out.println("Количество двадцатирублёвых купюр: " + e);
        }
        if (z > qtwenty) {
            c = b - (twenty * qtwenty);
            System.out.println("Количество сторублёвых купюр: " + qtwenty);
        }

    }

}