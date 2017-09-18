package pattern.behavioral.command;

public class GarageDownCommand implements Command {

    GarageDoor door;

    public GarageDownCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }

}
