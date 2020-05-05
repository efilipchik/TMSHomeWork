package Lesson9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class Run {
    public static void main(String[] args) {

        method(MyService.class);

    }

    static void method(Class<?> service) {
        if (service.isAnnotationPresent(Version.class)) {
            Version ann = service.getAnnotation(Version.class);
            MyService myService = new MyService("email", 1234567);
            thisClassInformation(myService);
        }

    }

    public static void thisClassInformation(Object myService) {
        try {
            Method method = myService.getClass().getDeclaredMethod("thisClassInformation");
            method.setAccessible(true);
            method.invoke(myService);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }


}
