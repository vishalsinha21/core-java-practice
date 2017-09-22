package pattern.behavioral.chain;

public abstract class RequestHandler {

    RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    abstract void handle(RequestType requestType);

    public void next(RequestType requestType) {
        if (next != null) {
            next.handle(requestType);
        } else {
            System.out.println("Chain finished");
        }
    }

}
