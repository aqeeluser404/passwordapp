package za.ac.mycput.domain;

import java.util.Objects;

public class Account {
    private String accountNumber;
    private String username;
    private String email;
    private String password;

    public Account() {
    }

    public Account(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.username = builder.username;
        this.email = builder.email;
        this.password = builder.password;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(username, account.username) && Objects.equals(email, account.email) && Objects.equals(password, account.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, username, email, password);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // builder class
    public static class Builder {
        private String accountNumber;
        private String username;
        private String email;
        private String password;

        public Builder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        // builder copy method
        public Builder copy(Account account) {
            this.accountNumber = account.accountNumber;
            this.username = account.username;
            this.email = account.email;
            this.password = account.password;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
