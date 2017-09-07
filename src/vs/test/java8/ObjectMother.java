package vs.test.java8;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ObjectMother {

    public static List<Employee> getEmployees() {
        Employee e1 = new Employee("Vishal", 100, asList("1111", "2222"));
        Employee e2 = new Employee("Nishant", 105, asList("3333", "4444"));
        Employee e3 = new Employee("Rajat", 110, asList("5555", "6666"));

        List<Employee> list = new ArrayList();
        list.add(e2);
        list.add(e1);
        list.add(e3);
        return list;
    }
}
