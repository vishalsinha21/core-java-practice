package pattern.behavioral.command;

import java.util.stream.IntStream;

public class RemoteControl {
    int SIZE = 5;

    Command[] onCommand = new Command[SIZE];
    Command[] offCommand = new Command[SIZE];

    public RemoteControl() {
        IntStream.range(0, 5).forEach(i -> {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        });
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void pushOnButton(int slot) {
        this.onCommand[slot].execute();
    }

    public void pushOffButton(int slot) {
        this.offCommand[slot].execute();
    }
}
