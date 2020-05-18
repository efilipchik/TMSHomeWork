package Lesson10.Task28;

import java.util.ArrayList;

public class MyClass<T> {

    private ArrayList<T> arrayList;

    public MyClass() {
        arrayList = new ArrayList<>();
    }

    public void add(T i) {
        arrayList.add(i);
    }

    public T get(int z) {
        return arrayList.get(z);
    }

}
