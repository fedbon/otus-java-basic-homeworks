package ru.otus.java;

class AnswerOptions {
    private final String firstAnswer;
    private final String secondAnswer;
    private final String thirdAnswer;
    private final String fourthAnswer;

    public AnswerOptions(String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer) {
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.fourthAnswer = fourthAnswer;
    }

    public void printAnswerOptions() {
        System.out.println(firstAnswer + "\n" + secondAnswer + "\n" + thirdAnswer + "\n" + fourthAnswer);
    }
}
