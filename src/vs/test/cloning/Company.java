package vs.test.cloning;

import java.util.List;
import java.util.stream.Collectors;

public class Company implements Cloneable {

    private final String companyName;
    private final Address address;
    private final List<Employee> employees;

    public Company(String companyName, Address address, List<Employee> employees) {
        this.companyName = companyName;
        this.address = address;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", address=" + address +
                ", employees=" + employees.stream().map(Employee::toString).collect(Collectors.joining("|")) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCompanyName() {
        return companyName;
    }

    public Address getAddress() {
        return address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
