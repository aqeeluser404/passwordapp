package za.ac.mycput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {

    public static String generateAccountNumber() {
        return UUID.randomUUID().toString();
    }

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isValidEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(email);
    }
}
