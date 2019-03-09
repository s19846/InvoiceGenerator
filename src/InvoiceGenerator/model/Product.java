package InvoiceGenerator.model;

public class Product {
    private String name;
    private double nettoPrice;
    private double vatValue;

    public String getName() {
        return name;
    }

    public double getNettoPrice() {
        return nettoPrice;
    }

    public double getVatValue() {
        return vatValue;
    }

    public double getBruttoPrice() {
        return this.nettoPrice * (1 + this.vatValue);
    }

    public Product(String name, double nettoPrice, double vatValue) {
        this.name = name;
        this.nettoPrice = nettoPrice;
        this.vatValue = vatValue;
    }
}
