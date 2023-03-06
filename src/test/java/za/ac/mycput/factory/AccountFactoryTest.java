package za.ac.mycput.factory;

import org.junit.jupiter.api.Test;
import za.ac.mycput.domain.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountFactoryTest {

    @Test
    void createAccount() {
        Account addAccount = AccountFactory.createAccount("kuro_neko", "tamakikotatsu404@gmail.com", "BE69420");
        System.out.println(addAccount.toString());
        assertNotNull(addAccount);
    }
    @Test
    void missingUsername() {
        Account addAccount = AccountFactory.createAccount(" ", "tamakikotatsu404@gmail.com", "BE69420");
        System.out.println(addAccount.toString());
        assertNotNull(addAccount);
    }
}