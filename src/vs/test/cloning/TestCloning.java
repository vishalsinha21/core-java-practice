package vs.test.cloning;

import static java.util.Arrays.asList;

public class TestCloning {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Vishal", "ASOC");
        System.out.println(employee);
        try {
            Employee clone = (Employee) employee.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        Employee employee1 = new Employee(2, "Ramesh", "ASE");
        Employee employee2 = new Employee(3, "Ram", "ASCC");

        Address address = new Address("street", "84647", "India");

        Company company = new Company("CSS", address, asList(employee, employee1, employee2));
        System.out.println(company);

        try {
            Company companyClone = (Company) company.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
