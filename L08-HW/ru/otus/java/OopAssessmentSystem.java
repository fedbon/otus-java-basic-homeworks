package ru.otus.java;

public class OopAssessmentSystem {

    public static void main(String[] args) {

        User user = new User();

        Question firstQuestion = new Question("Какое название было самым первым у Java?");
        firstQuestion.printQuestion();

        AnswerOptions firstAnswerOptions = new AnswerOptions("1. OAK",
                "2. Star7", "3. Polaris", "4. Spectrum");
        firstAnswerOptions.printAnswerOptions();

        user.checkUserInput();

        Question secondQuestion = new Question("Какой целочисленный примитивный тип в Java " +
                "занимает 4 байта в памяти?");
        secondQuestion.printQuestion();

        AnswerOptions secondAnswerOptions = new AnswerOptions("1. Byte",
                "2. Int", "3. Short", "4. Long");
        secondAnswerOptions.printAnswerOptions();

        user.checkUserInput();

        Question thirdQuestion = new Question("Какой оператор вычисляет остаток от деления?");
        thirdQuestion.printQuestion();

        AnswerOptions thirdAnswerOptions = new AnswerOptions("1. ++",
                "2. /", "3. %", "4. *");
        thirdAnswerOptions.printAnswerOptions();

        user.checkUserInput();

        Question fourthQuestion = new Question("В какой версии Java добавили ключевое слово var?");
        fourthQuestion.printQuestion();

        AnswerOptions fourthAnswerOptions = new AnswerOptions("1. Java 10",
                "2. Java 11", "3. Java 8", "4. Java 14");
        fourthAnswerOptions.printAnswerOptions();

        user.checkUserInput();

        user.showFinalResult();
    }
}
