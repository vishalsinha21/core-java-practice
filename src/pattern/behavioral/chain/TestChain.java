package pattern.behavioral.chain;

public class TestChain {

    public static void main(String[] args) {
        RequestHandler chain = new Commander(new Officer(new Soldier(null)));

        chain.handle(RequestType.ATTACK);
        chain.handle(RequestType.DEFEND);
        chain.handle(RequestType.COLLECT_TAX);
    }
}
