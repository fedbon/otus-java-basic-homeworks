package ru.otus.java;

public class Account {
    private final String accountId;
    private final int balance;

    public Account(String accountId, int balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
        result = prime * result + balance;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account that = (Account) o;

        if (balance != that.balance) return false;
        return accountId.equals(that.accountId);
    }

    @Override
    public String toString() {
        return "[Account ID: " + accountId + " | Balance: " + balance + " golds" + "]";
    }
}
