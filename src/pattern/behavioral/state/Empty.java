package pattern.behavioral.state;

public class Empty implements State {

    GumBallMachine machine;

    public Empty(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("machine is empty, no need to insert coin");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("no quarter to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("machine is empty");
    }

    @Override
    public void dispense() {
        System.out.println("nothing to dispense");
    }
}
