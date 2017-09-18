package pattern.behavioral.command;

import java.util.stream.IntStream;

public class TestCommand {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        remote.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        Fan fan = new Fan();
        remote.setCommand(1, new FanOnCommand(fan), new FanOffCommand(fan));
        GarageDoor door = new GarageDoor();
        remote.setCommand(2, new GarageUpCommand(door), new GarageDownCommand(door));

        IntStream.range(0, 5).forEach(i -> {
            remote.pushOnButton(i);
            remote.pushOffButton(i);
        });

    }
}
