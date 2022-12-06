package unit;

import ru.otus.game.service.DiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class DiceImplTest {
    @Test
    public void testRollForCorrectValue() {
        DiceImpl diceImpl = new DiceImpl();
        int minValue = 1;
        int maxValue = 6;
        int actual = diceImpl.roll();
        System.out.printf("Выпавшее значение кубика: %d", actual);
        Assert.assertTrue(actual > minValue);
        Assert.assertTrue(actual < maxValue);
    }
}


