package Lesson6;

/**Создать класс и объекты описывающие промежуток времени. Сам промежуток
 в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 Сделать методы для получения полного количества секунд в объекте, сравнения
 двух объектов (метод должен работать аналогично compareTo в строках). Создать
 два конструктора: получающий общее количество секунд, и часы, минуты и секунды
 по отдельности. Сделать метод для вывода данных.*/

public class Task24 {
    int second;
    int minute;
    int hour;

    public Task24(int sec){
        hour = sec/3600;
        minute = (sec % 3600) / 60;
        second = (sec % 3600) % 60;
    }

    public Task24(int s, int m, int h){
        second = s;
        minute = m;
        hour = h;
    }

    public int seconds(){
        return second + minute * 60 + hour * 3600;

    }

    public boolean compareObject(Task24 obj) {
        boolean result;
        if (second == obj.second && minute == obj.minute && hour == obj.hour) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }

    public void result () {
        System.out.println(hour + " h, " + minute + " min, " + second + " sec");
        System.out.println("Количество секунд " + seconds());

    }

}

