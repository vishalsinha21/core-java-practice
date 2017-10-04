package pattern.creational.builder;

public class TestBuilder {

    public static void main(String[] args) {
        Employee employee = EmployeeBuilder.builder()
                .withId("1122334455")
                .withName("Vishal Sinha")
                .withAge(35)
                .withDesignation("ASOC")
                .withSalary(100000)
                .withAddress("Oslo, Norway")
                .withProfile("Senior Java Consultant")
                .build();

        System.out.println(employee);
    }
}
