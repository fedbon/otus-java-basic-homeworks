package unit.fakes;

import ru.otus.game.service.Dice;

public class DiceSpyPlayer1Win implements Dice {
    int count = 0;
    @Override
    public int roll() {
        if (count == 0) {
            count++;
            return 6;
        } else {
           return 1;
        }
    }
}
