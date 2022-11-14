package ru.otus.java;

public class ConsoleUserOutput implements UserOutput {

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}
