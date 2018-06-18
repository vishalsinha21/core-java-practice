package pattern.creational.builder.a;

public class TestBuilder {

    public static void main(String[] args) {
        Student.Builder builder = Student.getBuilder();
        Student student = builder
                .setName("Vishal")
                .setAge(32)
                .setAddress("India")
                .build();

        System.out.println(student);
    }
}
