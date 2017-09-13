package vs.test;

public interface Vehicle {

    public void move();

    default void hoot() {
        System.out.println("peep!");
    }

    default void hoot1() {
        System.out.println("peep!");
    }

}
