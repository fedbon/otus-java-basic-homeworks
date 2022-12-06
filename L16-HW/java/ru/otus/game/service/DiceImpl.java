package ru.otus.game.service;

import java.util.Random;

public class DiceImpl implements Dice {
    @Override
    public int roll() {
        return new Random().nextInt();
    }
}
