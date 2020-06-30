package vs.test;

import java.util.function.IntConsumer;

public class TestTypes {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};
        //array is a object
        Object obj = arr;
        System.out.println(obj);

        //Object intCons = i -> System.out.print(i); - this is not possible as Object is not a functional interface but its possible with casting as shown below
        Object intCons = (IntConsumer) i -> System.out.print(i);
    }

}
