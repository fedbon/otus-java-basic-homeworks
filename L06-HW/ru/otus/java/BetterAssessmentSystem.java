import java.util.Scanner;

/**
 * Программа "Система тестирования" v.0.2b.
 * Бондарев Федор Олегович
 */
public class BetterAssessmentSystem {

    private static final String[] QUESTIONS = new String[]{"Какое название было самым первым у Java?",
            "Какой целочисленный примитивный тип в Java занимает 4 байта в памяти?",
            "Какой оператор вычисляет остаток от деления?",
            "В какой версии Java добавили ключевое слово var?"};

    private static final String[][] ANSWERS = new String[][]{
            {"1. OAK", "2. Star7", "3. Polaris", "4. Spectrum"},
            {"1. Byte", "2. Int", "3. Short", "4. Long"},
            {"1. ++", "2. /", "3. %", "4. *"},
            {"1. Java 10", "2. Java 11", "3. Java 8", "4. Java 14"}
    };

    private static final int[] CORRECT_ANSWERS = new int[]{1, 2, 3, 1};

    public static void main(String[] args) {
        int correctCount = 0;
        int wrongCount = 0;

        int k = 0;

        while (k < QUESTIONS.length) {
            System.out.print(QUESTIONS[k] + " ");
            for (int i = 0; i < ANSWERS.length; i++) {
                for (int j = 0; j < ANSWERS[i].length; j++) {
                    if (i == k) System.out.print("\n" + ANSWERS[i][j] + " ");
                }
            }
            System.out.println();

            Scanner sc = new Scanner(System.in);
            int answerChecker;

            do {
                System.out.println("\n" + "Ваш ответ:");
                while (!sc.hasNextInt()) {
                    System.out.println("Ошибка ввода! Необходимо ввести число");
                    System.out.println("\n" + "Ваш ответ:");
                    sc.next();
                }
                answerChecker = sc.nextInt();
                if (answerChecker < 1 || answerChecker > 4)
                    System.out.println("Ошибка ввода! Выберете номер ответа от 1 до 4");
            } while (answerChecker < 1 || answerChecker > 4);

            if (answerChecker == CORRECT_ANSWERS[k]) {
                System.out.println("Правильно");
                correctCount++;
            } else if (answerChecker != CORRECT_ANSWERS[k]) {
                System.out.println("Неправильно");
                wrongCount++;
            }
            System.out.println();
            k++;
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}