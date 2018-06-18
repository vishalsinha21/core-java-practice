package oops.hashequals;

import java.util.HashSet;

public class TestHashEquals {

    public static void main(String[] args) {
        Student student1 = new Student("a", "name1", "standard1");
        Student student2 = new Student("2", "name2", "standard2");
        Student student3 = new Student("a", "name1", "standard1");

        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));

        HashSet<Student> set = new HashSet<>();
        set.add(student1);
        set.add(student2);
        set.add(student3);

        System.out.println("set size:" + set.size());
    }
}
