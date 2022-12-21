package unit.fakes;

import ru.otus.game.service.Dice;

public class DiceSpyPlayer2Win implements Dice {
    int count = 0;
    @Override
    public int roll() {
        if (count == 0) {
            count++;
            return 1;
        } else {
            return 6;
        }
    }
}
