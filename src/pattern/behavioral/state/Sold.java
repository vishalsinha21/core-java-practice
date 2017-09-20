package pattern.behavioral.state;

public class Sold implements State {

    GumBallMachine machine;

    public Sold(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("wait for gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("nothing to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("wait for gumball");
    }

    @Override
    public void dispense() {
        System.out.println("releasing gumball");
        machine.release();
        if (machine.gumCount == 0) {
            machine.setCurrentState(machine.getEmpty());
        } else {
            machine.setCurrentState(machine.getNoQuarter());
        }
    }
}
