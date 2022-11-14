package ru.otus.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OopAssessmentSystem {
    public static void main(String[] args) {
        TestElement element1 = new TestElement("Какое название было самым первым у Java?",
                Arrays.asList("1. OAK", "2. Star7", "3. Polaris", "4. Spectrum"), 1);
        TestElement element2 = new TestElement("Какой целочисленный примитивный тип " +
                "в Java занимает 4 байта в памяти?",
                Arrays.asList("1. Byte", "2. Int", "3. Short", "4. Long"), 2);
        TestElement element3 = new TestElement("Какой оператор вычисляет остаток от деления?",
                Arrays.asList("1. ++", "2. /", "3. %", "4. *"), 3);
        TestElement element4 = new TestElement("В какой версии Java добавили ключевое слово var?",
                Arrays.asList("1. Java 10", "2. Java 11", "3. Java 8", "4. Java 14"), 1);

        List<TestElement> blocks = new ArrayList<>();

        blocks.add(element1);
        blocks.add(element2);
        blocks.add(element3);
        blocks.add(element4);

        Test test = new Test(blocks);
        test.runTest();
    }
}
