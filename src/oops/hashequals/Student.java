package oops.hashequals;

public class Student {

    private String id;
    private String name;
    private String standard;

    public Student(String id, String name, String standard) {
        this.id = id;
        this.name = name;
        this.standard = standard;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStandard() {
        return standard;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj != null && obj instanceof Student) {
            Student s = (Student) obj;
            if (s.id != null) {
                return s.id.equals(this.id);
            }
        }

        return false;
    }
}
