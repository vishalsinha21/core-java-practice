package vs.test.java8;

import java.util.Collection;
import java.util.List;

import static vs.test.java8.ObjectMother.getEmployees;


public class MapAndFlatMap {

    public static void main(String[] args) {
        List<Employee> employees = getEmployees();

        employees.stream()
                .map(emp -> emp.getPhoneNumber())
                .forEach(list -> list.forEach(System.out::println));

        System.out.println("--------------------");

        employees.stream()
                .map(emp -> emp.getPhoneNumber())
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }

}
