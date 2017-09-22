package pattern.behavioral.chain;

public class Commander extends RequestHandler {

    public Commander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handle(RequestType requestType) {
        System.out.println(String.format("%s is handling request to %s", getClass().getSimpleName(), requestType));
        super.next(requestType);
    }

}
