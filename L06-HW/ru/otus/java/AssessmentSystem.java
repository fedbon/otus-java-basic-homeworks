import java.util.Scanner;

/**
 * Программа "Система тестирования" v.0.1b.
 * Бондарев Федор Олегович
 */
public class AssessmentSystem {

    private static final String[] QUESTIONS = new String[]{"Какое название было самым первым у Java?",
            "Какой целочисленный примитивный тип в Java занимает 4 байта в памяти?",
            "Какой оператор вычисляет остаток от деления?"};

    private static final String[][] ANSWERS = new String[][]{
            {"1. OAK", "2. Star7", "3. Polaris", "4. Spectrum"},
            {"1. Byte", "2. Int", "3. Short", "4. Long"},
            {"1. ++", "2. /", "3. %", "4. *"}
    };

    public static void main(String[] args) {

        int correctCount = 0;
        int wrongCount = 0;

        System.out.println(QUESTIONS[0] + "\n" + ANSWERS[0][0] + "\n" + ANSWERS[0][1] + "\n" + ANSWERS[0][2] +
                "\n" + ANSWERS[0][3]);
        System.out.print("Ваш ответ: ");

        Scanner firstScanner = new Scanner(System.in);
        int firstAnswer = firstScanner.nextInt();

        switch (firstAnswer) {
            case 1 -> {
                System.out.println(firstAnswer + "\n" + "Правильно");
                correctCount++;
            }
            case 2 -> {
                System.out.println(firstAnswer + "\n" + "Неправильно");
                wrongCount++;
            }
            case 3 -> {
                System.out.println(firstAnswer + "\n" + "Неправильно");
                wrongCount++;
            }
            default -> System.out.println("Неизвестная операция " + firstAnswer);
        }

        System.out.println(QUESTIONS[1] + "\n" + ANSWERS[1][0] + "\n" + ANSWERS[1][1] + "\n" + ANSWERS[1][2] +
                "\n" + ANSWERS[1][3]);
        System.out.print("Ваш ответ: ");

        Scanner secondScanner = new Scanner(System.in);
        int secondAnswer = secondScanner.nextInt();

        switch (secondAnswer) {
            case 1 -> {
                System.out.println(secondAnswer + "\n" + "Неправильно");
                wrongCount++;
            }
            case 2 -> {
                System.out.println(secondAnswer + "\n" + "Правильно");
                correctCount++;
            }
            case 3 -> {
                System.out.println(secondAnswer + "\n" + "Неправильно");
                wrongCount++;
            }
            default -> System.out.println("Неизвестная операция " + secondAnswer);
        }

        System.out.println(QUESTIONS[2] + "\n" + ANSWERS[2][0] + "\n" + ANSWERS[2][1] + "\n" + ANSWERS[2][2] +
                "\n" + ANSWERS[2][3]);
        System.out.print("Ваш ответ: ");

        Scanner thirdScanner = new Scanner(System.in);
        int thirdAnswer = thirdScanner.nextInt();

        switch (thirdAnswer) {
            case 1 -> {
                System.out.println(thirdAnswer + "\n" + "Неправильно");
                wrongCount++;
            }
            case 2 -> {
                System.out.println(thirdAnswer + "\n" + "Неправильно");
                wrongCount++;
            }
            case 3 -> {
                System.out.println(thirdAnswer + "\n" + "Правильно");
                correctCount++;
            }
            default -> System.out.println("Неизвестная операция " + thirdAnswer);
        }
        System.out.println("Общий результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
