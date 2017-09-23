package pattern.behavioral.mediator;

public abstract class Colleague {

    Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        mediator.add(this);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void receive(String message, Colleague originator) {
        System.out.println(String.format("%s | message sent by %s: %s",
                this.getClass().getSimpleName(),
                originator.getClass().getSimpleName(),
                message));
    }
}
