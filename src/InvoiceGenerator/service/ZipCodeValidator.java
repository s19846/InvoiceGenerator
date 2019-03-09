package InvoiceGenerator.service;

import java.util.stream.IntStream;

public class ZipCodeValidator {
    private String zipCode;

    public ZipCodeValidator(String zipCode) {
        this.zipCode = zipCode;
    }

    public boolean isValid() {
        if (this.zipCode.length() != 6) {
            return false;
        }

        if (this.zipCode.charAt(2) != '-') {
            return false;
        }

        int zipArrayIndex = 0;
        int numPositions[] = {0,1,3,4,5};
        for (char zipChar : this.zipCode.toCharArray()) {
            if (IntStream.of(numPositions).anyMatch(x -> x == zipArrayIndex)) {
                if (!Character.isDigit(zipChar)) {
                    return false;
                }
            }
        }

        return true;
    }
}
