package oops.map;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class TestMapWorking {

    public static void main(String[] args) {
        Employee emp1 = new Employee("1", "1", BigInteger.valueOf(10000));
        Employee emp2 = new Employee("2", "2", BigInteger.valueOf(10000));
        Employee emp3 = new Employee("3", "3", BigInteger.valueOf(10000));

        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));
        System.out.println(emp2.equals(emp3));

        Map map = new HashMap<Employee, String>();


        map.put(emp1, "1");
        map.put(emp2, "2");
        map.put(emp3, "3");

        System.out.println(map);

        int ascii = (int) 'a';
        System.out.println(ascii);

        char c = (char) 402;
        System.out.println(c);
    }



}


class Employee {

    private String empId;
    private String empName;
    private BigInteger salary;

    public Employee(String empId, String empName, BigInteger salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(empId);
    }
}