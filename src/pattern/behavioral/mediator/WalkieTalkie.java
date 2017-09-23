package pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class WalkieTalkie implements Mediator {

    List<Colleague> users = new ArrayList<>();

    @Override
    public void add(Colleague colleague) {
        users.add(colleague);
    }

    @Override
    public void send(String message, Colleague originator) {
        for (Colleague user : users) {
            if (user != originator) {
                user.receive(message, originator);
            }
        }
    }

}
