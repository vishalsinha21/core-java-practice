package vs.test.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {

    public static void main(String[] args) {
        List<Employee> list = getEmployees();

        System.out.println("before:" + list);
        
        Collections.sort(list);

        System.out.println("after:" + list);
    }

    private static List<Employee> getEmployees() {
        Employee e1 = new Employee("Vishal", 100);
        Employee e2 = new Employee("Nishant", 105);
        Employee e3 = new Employee("Rajat", 110);

        List<Employee> list = new ArrayList();
        list.add(e2);
        list.add(e1);
        list.add(e3);
        return list;
    }

}
