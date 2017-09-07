package pattern.prototype;

import static java.util.Arrays.asList;

public class TestPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        Company company = new Company("ABC", "Test street 1", asList("Vishal", "Nishant", "Rajat"));
        
        Company company1 = (Company) company.clone();
        System.out.println("Company::" + company);
        
        company1.setName("XYZ");
        company1.setEmployeeNames(asList("Prashant", "Abhiskek", "Abhinav"));
        System.out.println("Company 1::" + company1);
    }
}
