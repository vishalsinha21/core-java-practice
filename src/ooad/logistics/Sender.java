package ooad.logistics;

public class Sender implements Contact {

    private String name;
    private String address;
    private String postalCode;

    @Override
    public String getPostalCode() {
        return postalCode;
    }

}
