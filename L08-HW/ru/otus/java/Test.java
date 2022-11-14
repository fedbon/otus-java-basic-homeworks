package ru.otus.java;
import java.util.List;

public class Test {
    private int correctCount = 0;
    private int wrongCount = 0;
    private final List<TestElement> blocks;

    private final UserOutput output = new ConsoleUserOutput();
    public Test(List<TestElement> blocks) {
        this.blocks = blocks;
    }

    void runTest() {
        for (TestElement block : blocks) {
            if (block.ask()) {
                correctCount++;
            } else {
                wrongCount++;
            }
        }
        output.printMessage("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
