package pattern.creational.builder.a;

public class Student {

    private final String studentId;
    private final String name;
    private final int age;
    private final int standard;
    private final String section;
    private final String address;
    private final String schoolHouse;
    private final boolean prefect;

    private Student(String studentId, String name, int age, int standard, String section, String address, String schoolHouse, boolean prefect) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.standard = standard;
        this.section = section;
        this.address = address;
        this.schoolHouse = schoolHouse;
        this.prefect = prefect;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", standard=" + standard +
                ", section='" + section + '\'' +
                ", address='" + address + '\'' +
                ", schoolHouse='" + schoolHouse + '\'' +
                ", prefect=" + prefect +
                '}';
    }

    public static class Builder {

        private String studentId;
        private String name;
        private int age;
        private int standard;
        private String section;
        private String address;
        private String schoolHouse;
        private boolean prefect;

        public boolean built = false;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setStandard(int standard) {
            this.standard = standard;
            return this;
        }

        public Builder setSection(String section) {
            this.section = section;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setSchoolHouse(String schoolHouse) {
            this.schoolHouse = schoolHouse;
            return this;
        }

        public Builder setPrefect(boolean prefect) {
            this.prefect = prefect;
            return this;
        }

        public Student build() {
            if (built) {
                throw new IllegalStateException("already built, cannot build again");
            }
            built = true;
            return new Student(this.studentId, this.name, this.age, this.standard, this.section, this.address, this.schoolHouse, this.prefect);
        }

    }
}
