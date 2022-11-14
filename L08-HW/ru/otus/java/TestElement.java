package ru.otus.java;
import java.util.List;

public class TestElement {
    private final String questionName;
    private final List<String> options;
    private int indexCorrectAnswer = 0;
    private final UserInput input = new ConsoleUserInput();
    private final UserOutput output = new ConsoleUserOutput();

    public TestElement(String questionName, List<String> options, int indexCorrectAnswer) {
        this.questionName = questionName;
        this.options = options;
        this.indexCorrectAnswer = indexCorrectAnswer;
    }
    public boolean ask() {
        output.printMessage(questionName);
        for (String answer : options) {
            output.printMessage(answer);
        }
        int inputChecker = input.ask(1, options.size());
        if (inputChecker == indexCorrectAnswer) {
            output.printMessage("Правильно");
            return true;
        } else {
            output.printMessage("Неправильно");
            return false;
        }
    }
}
