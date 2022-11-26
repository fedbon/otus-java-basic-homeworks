package ru.otus.java;


import java.util.List;

public class GoldenBank {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        Client bondarevFedor = new Client("Fedor Bondarev", 25);
        Account bondarevFedorAccount1 = new Account("54321", 100);
        Account bondarevFedorAccount2 = new Account("12313", 250);
        Account bondarevFedorAccount3 = new Account("31313", 550);
        Account bondarevFedorAccount4 = new Account("12414", 50);
        bondarevFedor.getAccountList().add(bondarevFedorAccount1);
        bondarevFedor.getAccountList().add(bondarevFedorAccount2);
        bondarevFedor.getAccountList().add(bondarevFedorAccount3);
        bondarevFedor.getAccountList().add(bondarevFedorAccount4);

        Client morozovPetr = new Client("Petr Morozov", 25);
        Account morozovPetrAccount1 = new Account("14555", 130);
        Account morozovPetrAccount2 = new Account("72313", 210);
        Account morozovPetrAccount3 = new Account("88313", 850);
        morozovPetr.getAccountList().add(morozovPetrAccount1);
        morozovPetr.getAccountList().add(morozovPetrAccount2);
        morozovPetr.getAccountList().add(morozovPetrAccount3);

        dataBase.addClient(bondarevFedor);
        dataBase.addClient(morozovPetr);

        dataBase.addAccount(bondarevFedorAccount1, bondarevFedor);
        dataBase.addAccount(bondarevFedorAccount2, bondarevFedor);
        dataBase.addAccount(bondarevFedorAccount3, bondarevFedor);
        dataBase.addAccount(bondarevFedorAccount4, bondarevFedor);

        Client searchClient = new Client("Fedor Bondarev", 25);

        List<Account> getAccounts = dataBase.getAccounts(searchClient);
        Client findClient = dataBase.findClient(bondarevFedorAccount1);
    }
}

