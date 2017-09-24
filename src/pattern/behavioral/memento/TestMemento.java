package pattern.behavioral.memento;

public class TestMemento {

    public static void main(String[] args) {

        PhoneOriginator phone = new PhoneOriginator("audio1", "video1", "image1");
        PhoneCareTaker phoneCareTaker = new PhoneCareTaker();
        phoneCareTaker.save(phone);
        System.out.println("Before: " +  phone);

        phone.setAudio("audio2");
        phone.setVideo("video2");
        phone.setImages("image2");
        System.out.println("After: " +  phone);

        phoneCareTaker.restoreToLastBackUp(phone);
        System.out.println("After restoring backup: " +  phone);

    }
}
