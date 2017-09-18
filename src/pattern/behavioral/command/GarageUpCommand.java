package pattern.behavioral.command;

public class GarageUpCommand implements Command {

    GarageDoor door;

    public GarageUpCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }

}
