package oops.hashequals;

import java.util.HashMap;

public class GoodHashAndEquals {

    public static void main(String[] arg) {
        Employee emp1 = new Employee(1, "Vishal", "DSE");
        Employee emp2 = new Employee(2, "Vikas", "SFR");
        Employee emp3 = new Employee(1, "Vishal", "DSE");

        System.out.println(emp1.equals(emp2)); //false
        System.out.println(emp1.equals(emp3)); //true
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp3.hashCode());

        HashMap<Employee, String> hashMap = new HashMap<>();
        hashMap.put(emp1, "emp1");
        hashMap.put(emp2, "emp2");
        hashMap.put(emp3, "emp3");

        System.out.println(hashMap.size()); //2, since emp1 equals emp2 and their hashcode is same, so emp3 will overwrite emp1
        System.out.println(hashMap);
    }

}
