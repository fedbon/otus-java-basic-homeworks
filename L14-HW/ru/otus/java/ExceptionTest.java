package ru.otus.java;

public class ExceptionTest {

    public static void main(String[] args) {
        CheckingAccount testAccount = new CheckingAccount(777);
        System.out.println("Внесение 500 рублей...\n");
        testAccount.deposit(500.00);

        try {
            System.out.println("Снятие 100 рублей...\n");
            testAccount.withdraw(100.00);
            System.out.println("Снятие 600 рублей...\n");
            testAccount.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Извините, недостаточно средств " + e.getAmount() + " рублей\n");
            e.printStackTrace();
        }
    }
}
