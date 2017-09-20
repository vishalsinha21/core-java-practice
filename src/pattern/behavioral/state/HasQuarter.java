package pattern.behavioral.state;

public class HasQuarter implements State {

    GumBallMachine machine;

    public HasQuarter(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you already have inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("eject quarter");
        machine.setCurrentState(machine.getNoQuarter());
    }

    @Override
    public void turnCrank() {
        System.out.println("turning crank");
        machine.setCurrentState(machine.getSold());
        machine.getCurrentState().dispense();
    }

    @Override
    public void dispense() {
        System.out.println("cant dispense when no quarter");
    }
}
