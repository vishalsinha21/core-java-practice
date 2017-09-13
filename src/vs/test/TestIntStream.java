package vs.test;

import java.util.stream.IntStream;

public class TestIntStream {

    public static void main(String[] args) {

        IntStream.range(0, 100).forEach(System.out::println);

    }
}
