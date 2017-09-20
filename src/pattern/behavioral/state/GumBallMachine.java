package pattern.behavioral.state;

public class GumBallMachine implements State {

    private State empty;
    private State noQuarter;
    private State hasQuarter;
    private State sold;

    State currentState;
    int gumCount = 0;


    public GumBallMachine(int gumCount) {
        this.gumCount = gumCount;
        empty = new Empty(this);
        noQuarter = new NoQuarter(this);
        hasQuarter  =new HasQuarter(this);
        sold = new Sold(this);

        if (gumCount > 0) {
            currentState = noQuarter;
        } else {
            currentState = empty;
        }
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getGumCount() {
        return gumCount;
    }

    public void release() {
        gumCount = gumCount - 1;
    }

    public State getEmpty() {
        return empty;
    }

    public State getNoQuarter() {
        return noQuarter;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }

    public State getSold() {
        return sold;
    }

    @Override
    public void insertQuarter() {
        currentState.insertQuarter();
    }

    @Override
    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        currentState.turnCrank();
    }

    @Override
    public void dispense() {
        currentState.dispense();
    }
}
