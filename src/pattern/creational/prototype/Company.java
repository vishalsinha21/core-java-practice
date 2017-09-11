package pattern.creational.prototype;

import java.util.List;

public class Company implements Cloneable {
    
    private String name;
    private String address;
    private List<String> employeeNames;

    public Company(String name, String address, List<String> employeeNames) {
        this.name = name;
        this.address = address;
        this.employeeNames = employeeNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getEmployeeNames() {
        return employeeNames;
    }

    public void setEmployeeNames(List<String> employeeNames) {
        this.employeeNames = employeeNames;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", employeeNames=" + employeeNames +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Company(this.name, this.address, this.employeeNames);
    }
}
