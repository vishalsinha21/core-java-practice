package pattern.behavioral.state;

import java.util.stream.IntStream;

public class TestState {

    public static void main(String[] args) {
        GumBallMachine machine = new GumBallMachine(3);

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();

        int[] arr = {1, 2, 3};

        System.out.println(IntStream.of(arr).sum());

    }
}
