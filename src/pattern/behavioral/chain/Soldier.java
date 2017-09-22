package pattern.behavioral.chain;

public class Soldier extends RequestHandler {

    public Soldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handle(RequestType requestType) {
        System.out.println(String.format("%s is handling request to %s", getClass().getSimpleName(), requestType));
        super.next(requestType);
    }

}
