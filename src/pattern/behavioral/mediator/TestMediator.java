package pattern.behavioral.mediator;

public class TestMediator {

    public static void main(String[] args) {
        Mediator walkieTalkie = new WalkieTalkie();

        User1 user1 = new User1(walkieTalkie);
        User2 user2 = new User2(walkieTalkie);
        User3 user3 = new User3(walkieTalkie);

        user1.send("hi, this is user1");
        user2.send("hi, this is user2");
        user3.send("hi, this is user3");
    }
}
