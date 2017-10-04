package pattern.creational.builder;

public class Employee {

    private String employeeId;
    private String name;
    private int age;
    private double salary;
    private String address;
    private String designation;
    private String profile;

    public Employee(String employeeId, String name, int age, double salary, String address, String designation, String profile) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
        this.designation = designation;
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", designation='" + designation + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }

}

