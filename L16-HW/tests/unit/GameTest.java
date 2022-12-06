package unit;

import org.junit.Assert;
import org.junit.Test;
import ru.otus.game.service.Dice;
import ru.otus.game.service.Game;
import ru.otus.game.service.GameWinnerPrinter;
import ru.otus.game.service.Player;
import unit.fakes.DiceSpyPlayer1Win;
import unit.fakes.DiceSpyPlayer2Win;

public class GameTest {
    @Test
    public void testPlayer1Win() {
        Dice dice = new DiceSpyPlayer1Win();
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        GameWinnerPrinter winnerPrinter = winner -> Assert.assertEquals(player1, winner);
        Game game = new Game(dice, winnerPrinter);
        game.playGame(player1, player2);
    }
    @Test
    public void testPlayer2Win() {
        Dice dice = new DiceSpyPlayer2Win();
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        GameWinnerPrinter winnerPrinter = winner -> Assert.assertEquals(player2, winner);
        Game game = new Game(dice, winnerPrinter);
        game.playGame(player1, player2);
    }
    @Test
    public void testNobodyWin() {
        Dice dice = () -> 1;
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        Player nobody = new Player("Ничья");
        GameWinnerPrinter winnerPrinter = winner -> Assert.assertEquals(nobody, winner);
        Game game = new Game(dice, winnerPrinter);
        game.playGame(player1, player2);
    }
}
