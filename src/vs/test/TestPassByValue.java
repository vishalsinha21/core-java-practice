package vs.test;

import java.util.ArrayList;

public class TestPassByValue {

    public static void main(String[] args) {
        String name = "Vishal";

        System.out.println("before: " + name);
        sayHello(name);
        System.out.println("after: " + name);

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        System.out.println("before: " + list);
        appendToList(list);
        System.out.println("after: " + list);
        
    }

    private static void appendToList(ArrayList<String> list) {
        list.add("three");
    }

    private static void sayHello(String name) {
        name = "Hello " + name;
    }

}
