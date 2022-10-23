import java.util.Scanner;

public class BetterAssessmentSystem {

    private static final String[][] ANSWERS = new String[][]{
            {"Какое название было самым первым у Java?", "1. OAK", "2. Star7", "3. Polaris", "4. Spectrum"},
            {"Какой целочисленный примитивный тип в Java занимает 4 байта в памяти?", "1. Byte", "2. Int",
                    "3. Short", "4. Long"},
            {"Какой оператор вычисляет остаток от деления?", "1. ++", "2. /", "3. %", "4. *"}
    };

    private static final int[] CORRECT_ANSWERS = new int[]{1, 2, 3};

    public static void main(String[] args) {
        int correctCount = 0;
        int wrongCount = 0;

        Scanner Scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + "\n" + ANSWERS[i][j] + " ");
            }
            System.out.println("\n" + "Ваш ответ");
            int scanner = Scanner.nextInt();
            if (scanner == CORRECT_ANSWERS[0]) {
                System.out.println("Правильно");
                correctCount++;
            } else {
                System.out.println("Неправильно");
                wrongCount++;
            }
            System.out.println();
        }
        System.out.println("Общий результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
