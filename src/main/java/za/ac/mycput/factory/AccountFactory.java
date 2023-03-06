package za.ac.mycput.factory;

import za.ac.mycput.domain.Account;
import za.ac.mycput.util.Helper;

public class AccountFactory {
    public static Account createAccount(String username, String email, String password) {
        if (Helper.isNullOrEmpty(username) || Helper.isNullOrEmpty(password))
            return null;
        String accountNumber = Helper.generateAccountNumber();

        if (!Helper.isValidEmail(email)) {
            return null;
        }

        return new Account.Builder()
                .setAccountNumber(accountNumber)
                .setUsername(username)
                .setEmail(email)
                .setPassword(password)
                .build();
    }
}
