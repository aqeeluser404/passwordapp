package za.ac.mycput.domain;

public class Accounts {
    private String accountNumber;
    private String username;
    private String email;
    private String password;

    public Accounts() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "accountNumber='" + accountNumber + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
