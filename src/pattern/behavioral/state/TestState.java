package pattern.behavioral.state;

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
    }
}
