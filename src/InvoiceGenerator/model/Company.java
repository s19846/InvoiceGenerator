package InvoiceGenerator.model;

import InvoiceGenerator.service.IbanValidator;
import InvoiceGenerator.service.NipValidator;

public class Company {
    private String name;
    private String nip;
    private Address address;
    private String bankAccount;
    private boolean valid;

    public String getName() {
        return name;
    }

    public String getNip() {
        return nip;
    }

    public Address getAddress() {
        return address;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public boolean isValid() {
        return valid;
    }

    public Company(String name, String nip, Address address, String bankAccount) {
        this.name = name;
        this.nip = nip;
        this.address = address;
        this.bankAccount = bankAccount;
        this.valid = this.validateCompany();
    }

    private boolean validateCompany() {
        return this.validateNip() && this.validateBankAccount();
    }

    private boolean validateNip() {
        NipValidator nipValidator = new NipValidator(this.nip);
        return nipValidator.isValid();
    }

    private boolean validateBankAccount() {
        IbanValidator ibanValidator = new IbanValidator();
        return ibanValidator.ibanTest(this.bankAccount);
    }
}
