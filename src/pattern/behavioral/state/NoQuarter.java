package pattern.behavioral.state;

public class NoQuarter implements State {

    GumBallMachine machine;

    public NoQuarter(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you have inserted a quarter");
        machine.setCurrentState(machine.getHasQuarter());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("no quarter to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("add quarter first to turn crank");
    }

    @Override
    public void dispense() {
        System.out.println("cant dispense when no quarter");
    }
}
