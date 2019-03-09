package InvoiceGenerator.model;

import java.util.Date;

public class Invoice {
    private Product product;
    private int amount;
    private String serialNumber;
    private Date sentDate;
    private Date saleDate;
    private Date paymentDate;

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Invoice(
            Product product,
            int amount,
            String serialNumber,
            Date sentDate
    ) {
        this.product = product;
        this.amount = amount;
        this.serialNumber = serialNumber;
        this.sentDate = sentDate;
    }
}
