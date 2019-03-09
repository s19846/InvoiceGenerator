import InvoiceGenerator.model.Address;
import InvoiceGenerator.model.Company;
import InvoiceGenerator.model.Invoice;
import InvoiceGenerator.model.Product;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        invoiceGeneratingProcess();
    }

    public static void invoiceGeneratingProcess() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_WEEK, -1);
        Date yesterday = calendar.getTime();

        Invoice invoice = new Invoice(
                generateProduct(),
                generateCompany(),
                50,
                yesterday,
                new Date()
        );

        System.out.println("FAKTURA");
        System.out.println(invoice.getSerial());
        System.out.println("Nazwa firmy");
        System.out.println(invoice.getCompany().getName());
        System.out.println("Produkt");
        System.out.println(invoice.getProduct().getName());
        System.out.println("Cena netto");
        System.out.println(invoice.getProduct().getNettoPrice());
        System.out.println("Stawka VAT");
        System.out.println(Math.round(invoice.getProduct().getVatValue() * 100) + "%");
        System.out.println("Cena brutto");
        System.out.println(invoice.getProduct().getBruttoPrice());
    }

    public static Product generateProduct() {
        return new Product(
                "Super Hiper Bajer",
                1000,
                0.23
        );
    }

    public static Address generateAddress() {
        return new Address(
                "Gdańsk",
                "Słoneczna Dolina",
                "5A",
                "65",
                "80-512"
        );
    }

    public static Company generateCompany() {
        return new Company(
                "Eks-Kom",
                "5223692003",
                generateAddress(),
                "PL31109012903032304887283124"
        );
    }
}
