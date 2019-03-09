package InvoiceGenerator.model;

import InvoiceGenerator.service.ZipCodeValidator;

public class Address {
    private String city;
    private String street;
    private String building;
    private String apartment;
    private String zipCode;
    private boolean valid;

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getApartment() {
        return apartment;
    }

    public String getZipCode() {
        return zipCode;
    }

    public boolean isValid() {
        return valid;
    }

    public Address(String city, String street, String building, String apartment, String zipCode) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
        this.zipCode = zipCode;
        ZipCodeValidator zipCodeValidator = new ZipCodeValidator(this.zipCode);
        this.valid = zipCodeValidator.isValid();
    }
}
