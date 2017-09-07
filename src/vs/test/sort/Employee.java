package vs.test.sort;

public class Employee implements Comparable<Employee>, Person {
    
    private String name;
    private Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        return this.salary.compareTo(other.salary);
    }
}
