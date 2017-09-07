package vs.test.java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {
        Stream<String> strStream = Stream.generate(() -> "hello");
        strStream.limit(10).forEach(System.out::println);

        IntStream.range(0, 5).forEach(System.out::print);
        System.out.println("\n");
        IntStream.rangeClosed(1, 5).forEach(System.out::print);

    }
}
