package Lesson10.Task28;

public class Runner {
    public static void main(String[] args) {

        MyClass<Integer> myList = new MyClass<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        int a = myList.get(1);
        System.out.println(a);
    }
}