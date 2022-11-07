package ru.otus.java;

import java.util.Scanner;

class User {
    private static final int[] CORRECT_ANSWERS = new int[]{1, 2, 3, 1};
    private int correctCount;
    private int wrongCount;
    private int i;

    public void checkUserInput() {
        Scanner sc = new Scanner(System.in);
        int inputChecker;
        do {
            System.out.println("\n" + "Ваш ответ:");
            while (!sc.hasNextInt()) {
                System.out.println("Ошибка ввода! Необходимо ввести число");
                System.out.println("\n" + "Ваш ответ:");
                sc.next();
            }
            inputChecker = sc.nextInt();
            if (inputChecker < 1 || inputChecker > 4)
                System.out.println("Ошибка ввода! Выберете номер ответа от 1 до 4");
        } while (inputChecker < 1 || inputChecker > 4);
        if (inputChecker == CORRECT_ANSWERS[i]) {
            System.out.println("Правильно");
            correctCount++;
        } else if (inputChecker != CORRECT_ANSWERS[i]) {
            System.out.println("Неправильно");
            wrongCount++;
        }
    }

    public void showFinalResult() {
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
