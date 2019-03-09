package InvoiceGenerator.model;

import java.util.Calendar;
import java.util.Date;

public class Invoice {
    private Product product;
    private Company company;
    private int amount;
    private String serial;
    private Date generatedDate;
    private Date saleDate;
    private Date paymentDate;

    public Product getProduct() {
        return product;
    }

    public Company getCompany() {
        return company;
    }

    public int getAmount() {
        return amount;
    }

    public String getSerial() {
        return serial;
    }

    public Date getGeneratedDate() {
        return generatedDate;
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
            Company company,
            int amount,
            Date saleDate,
            Date paymentDate
    ) {
        this.product = product;
        this.company = company;
        this.amount = amount;
        this.saleDate = saleDate;
        this.paymentDate = paymentDate;
        this.generatedDate = new Date();
        this.serial = this.generateInvoiceSerial();
    }

    private String generateInvoiceSerial() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.generatedDate);
        return "INV/" + calendar.get(Calendar.YEAR) + "/" + calendar.get(Calendar.MONTH) + "/5142/76";
    }
}
