package ru.otus.java;

import java.util.Scanner;

public class ConsoleUserInput implements UserInput {

    private final UserOutput output = new ConsoleUserOutput();
    @Override
    public int ask(int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int inputChecker;

        do {
            output.printMessage("\n" + "Ваш ответ:");
            while (!sc.hasNextInt()) {
                output.printMessage("Ошибка ввода! Необходимо ввести число");
                output.printMessage("\n" + "Ваш ответ:");
                sc.next();
            }
            inputChecker = sc.nextInt();
            if (inputChecker < minValue || inputChecker > maxValue)
                output.printMessage("Ошибка ввода! Выберете номер ответа от 1 до 4");
        } while (inputChecker < minValue || inputChecker > maxValue);
        return inputChecker;
    }
}
