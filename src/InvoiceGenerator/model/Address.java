package InvoiceGenerator.model;

public class Address {
    private String city;
    private String street;
    private String building;
    private String apartament;
    private String zipCode;

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getApartament() {
        return apartament;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address(String city, String street, String building, String apartament, String zipCode) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartament = apartament;
        this.zipCode = zipCode;
    }
}
