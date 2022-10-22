import java.util.Arrays;
import java.util.Scanner;

/**
 * Заготовка для выполнения ДЗ "Система тестирования".
 */
public class AssessmentSystem {

    public static void main(String[] args) {
        int correctCount = 0;
        int wrongCount = 0;

        String[] questions = new String[] {"Какое название было самым первым у Java?",
                "Какой целочисленный примитивный тип в Java занимает 4 байта в памяти?",
                "Какой оператор вычисляет остаток от деления?"};

        String[][] answers = new String[][] {
                {"1. OAK", "2. Star7", "3. Polaris", "4. Spectrum"},
                {"1. Byte", "2. Int", "3. Short", "4. Long"},
                {"1. ++", "2. /", "3. %", "4. *"}
        };
        System.out.println(questions[0] + "\n" + answers[0][0] + "\n" + answers[0][1] + "\n" + answers[0][2]);
        System.out.print("Ваш ответ: ");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();

        int result = 0;

        switch (a) {
            case 1:
                System.out.println(a + "\n" + "Правильно");
                correctCount++;
                break;
            case 2:
                System.out.println(a + "\n" + "Неправильно");
                wrongCount++;
                break;
            case 3:
                System.out.println(a + "\n" + "Неправильно");
                wrongCount++;
                break;
            default:
                System.out.println("Неизвестная операция " + a);
                break;
        }

        System.out.println(questions[1] + "\n" + answers[1][0] + "\n" + answers[1][1] + "\n" + answers[1][2]);
        System.out.print("Ваш ответ: ");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        int result2 = 0;

        switch (b) {
            case 1:
                System.out.println(b + "\n" + "Неправильно");
                wrongCount++;
                break;
            case 2:
                System.out.println(b + "\n" + "Правильно");
                correctCount++;
                break;
            case 3:
                System.out.println(b + "\n" + "Неправильно");
                wrongCount++;
                break;
            default:
                System.out.println("Неизвестная операция " + b);
                break;
        }
        System.out.println(questions[2] + "\n" + answers[2][0] + "\n" + answers[2][1] + "\n" + answers[2][2]);
        System.out.print("Ваш ответ: ");
        Scanner sc3 = new Scanner(System.in);
        int с = sc3.nextInt();

        int result3 = 0;

        switch (с) {
            case 1:
                System.out.println(с + "\n" + "Неправильно");
                wrongCount++;
                break;
            case 2:
                System.out.println(с + "\n" + "Неправильно");
                wrongCount++;
                break;
            case 3:
                System.out.println(с + "\n" + "Правильно");
                correctCount++;
                break;
            default:
                System.out.println("Неизвестная операция " + с);
                break;
        }
        System.out.println("Общий результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}

    /*public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        // TODO: Массив правильных ответов
        int[] correctAnswers = null

        // Примечание - можете придумать как хранить всю информацию в одном массиве

        Scanner scanner = new Scanner(System.in);
        // TODO: Цикл по всем вопросам - исправить, написать правильно
        for (int i = 0; i < 0; i++) {
            // TODO: Вывод вопроса на экран

            // TODO: Вывод вариантов ответов на экран

            System.out.print("Ваш ответ: ");
            //TODO: Считываем с консоли ответ пользователя

            //TODO: Проверяем ответ и выводим результат
            // а также увеличиваем счетчики правильных и неправильных ответов

            System.out.println();
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
*/