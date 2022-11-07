package ru.otus.java;

class Question {
    private final String questionTitle;

    public Question(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public void printQuestion() {
        System.out.println("\n" + questionTitle);
        System.out.println();
    }
}
