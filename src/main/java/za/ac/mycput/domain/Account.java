package za.ac.mycput.domain;

import java.util.Objects;

public class Accounts {
    private String accountNumber;
    private String username;
    private String email;
    private String password;

    public Accounts() {
    }

    public Accounts(Builder builder) {
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
        Accounts accounts = (Accounts) o;
        return Objects.equals(accountNumber, accounts.accountNumber) && Objects.equals(username, accounts.username) && Objects.equals(email, accounts.email) && Objects.equals(password, accounts.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, username, email, password);
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
        public Builder copy(Accounts accounts) {
            this.accountNumber = accounts.accountNumber;
            this.username = accounts.username;
            this.email = accounts.email;
            this.password = accounts.password;
            return this;
        }
        
        public Accounts build() {
            return new Accounts(this);
        }
    }
}
