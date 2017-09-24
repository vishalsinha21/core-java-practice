package pattern.behavioral.memento;

public class PhoneCareTaker {

    private Object obj;

    public void save(PhoneOriginator phone) {
        this.obj = phone.saveState();
    }

    public void restoreToLastBackUp(PhoneOriginator phone) {
        phone.restoreToLastBackUp(obj);
    }

}
