package ru.otus.java;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private int age;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Account> getAccountList() {
        return accounts;
    }

    public String getClientName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result =  1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client that = (Client) o;

        if (age != that.age) return false;
        return name.equals(that.name);
    }

    @Override
    public String toString() {
        return "\n" + "Client: " + name + " | Age: " + age + " | No of accounts: " + accounts.size();
    }
}
