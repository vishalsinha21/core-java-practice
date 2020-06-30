package vs.test;

import java.util.HashMap;

public class TestMap {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("one", "one");
        map.put("two", "two");
        map.put("three", "three");

        String value = map.computeIfAbsent("four", (val) -> "four");
        System.out.println(value);

        System.out.println(map);
        String newVal = map.computeIfPresent("one", (a, b) -> "1");
        System.out.println(map);
    }
}
