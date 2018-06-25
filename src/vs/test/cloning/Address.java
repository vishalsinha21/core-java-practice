package vs.test.cloning;

public class Address {

    private final String street;
    private final String postalCode;
    private final String country;


    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public Address(String street, String postalCode, String country) {
        this.street = street;
        this.postalCode = postalCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
