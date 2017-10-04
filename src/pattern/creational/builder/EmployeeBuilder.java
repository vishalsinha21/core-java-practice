package pattern.creational.builder;

public class EmployeeBuilder {

    private String employeeId;
    private String name;
    private int age;
    private double salary;
    private String address;
    private String designation;
    private String profile;


    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    public EmployeeBuilder() {
    }

    public EmployeeBuilder withId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public EmployeeBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder withAge(String name) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder withSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder withDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public EmployeeBuilder withProfile(String profile) {
        this.profile = profile;
        return this;
    }

    public Employee build() {
        return new Employee(employeeId, name, age, salary, address, designation, profile);
    }

}
