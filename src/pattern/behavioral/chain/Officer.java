package pattern.behavioral.chain;

public class Officer extends RequestHandler {

    public Officer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handle(RequestType requestType) {
        System.out.println(String.format("%s is handling request to %s", getClass().getSimpleName(), requestType));
        super.next(requestType);
    }

}
