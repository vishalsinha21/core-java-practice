package oops.immutable;

import java.text.ParseException;
import java.time.LocalDate;

public final class Employee {

    private final String id;
    private final String name;
    private final LocalDate dateOfBirth;

    public Employee(String id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public static void main(String[] args) throws ParseException {
        Employee employee = new Employee("1", "Vishal", LocalDate.of(1982, 2, 25));
        employee.dateOfBirth.plusYears(20);

        System.out.println(employee);
    }
}

