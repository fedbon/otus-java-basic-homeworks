package ru.otus.java;

import java.util.HashMap;
import java.util.List;

public class DataBase {
    public HashMap<String, Client> dataBase = new HashMap<>();
    public HashMap<Account, Client> accountToClientMap = new HashMap<>();

    public void addClient(Client newClient) {
        if (newClient != null) {
            dataBase.put(newClient.getClientName(), newClient);
        }
    }

    public void addAccount(Account account, Client client) {
        if (account != null) {
            accountToClientMap.put(account, client);
        }
    }

    public List<Account> getAccounts(Client client){
        return dataBase.get(client.getClientName()).getAccountList();
    }

    public Client findClient(Account account){
        return accountToClientMap.get(account);
    }
}
