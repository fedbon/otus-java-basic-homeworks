package ru.otus.java;

public class ExceptionTest {

    public static void main(String[] args) throws InsufficientFundsException {
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
            throw new CustomException("Извините, недостаточно средств " + e.getAmount() + " рублей\n", e);
        }

//        try (Resource resource = new Resource()) {
//            System.out.println("Работа выполняется");
//            if (true) return;
//        }
//        Resource resource = new Resource();
//
//        try {
//            System.out.println("Работа выполняется");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            resource.close();
//        }
    }
}
