package vs.test.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeWithLambda {

    public static void main(String[] args) {
        Employee e1 = new Employee("Vishal", 100);
        Employee e2 = new Employee("Nishant", 105);
        Employee e3 = new Employee("Rajat", 110);

        List<Employee> list = new ArrayList();
        list.add(e2);
        list.add(e1);
        list.add(e3);

        int totalSalary = list.stream().mapToInt(emp -> emp.getSalary()).sum();
        System.out.println("total salary::" + totalSalary);

        double avgSalary = list.stream().mapToInt(emp -> emp.getSalary()).average().getAsDouble();
        System.out.println("avg salary::" + avgSalary);

        System.out.println("before:" + list);

        List<Employee> sortedList = list.stream().sorted((first, second) -> first.getName().compareTo(second.getName())).collect(Collectors.toList());

        System.out.println("after:" + sortedList);
    }

}
