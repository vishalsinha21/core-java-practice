package vs.test.java8;

import java.util.List;

public class Employee {

    private String name;
    private Integer salary;
    private List<String> phoneNumber;

    public Employee(String name, Integer salary, List<String> phoneNumber) {
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
