package pattern.observer;

public class TestObserverPattern {

    public static void main(String[] args) {
        HexaObserver hexaObserver = new HexaObserver();
        BinaryObserver binaryObserver = new BinaryObserver();
        OctalObserver octalObserver = new OctalObserver();
        
        Subject subject = new Subject();
        subject.update(20);
    }

}
