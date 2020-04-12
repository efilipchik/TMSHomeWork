package Lesson10.Task32;

import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void method(HashMap<Integer, String> hMap, String value) {

        HashMap<Integer, String> copy = new HashMap<>(hMap);
        for (Map.Entry entry: copy.entrySet()) {
            if (entry.getValue().equals(value)) {
                hMap.remove(entry.getKey());
            }

        }

    }
}
