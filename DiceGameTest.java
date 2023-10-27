import static org.junit.Assert.assertEquals;

import org.junit.*;

public class DiceGameTest {
    
    @Test
    public void threeThousandShouldWin(){
        var game = new DiceGame(2);
        game.createPlayerArr();
        game.setPlayerBalance(3000, 1);
        assertEquals(true, game.verifyWin(1));
    }

    @Test
    public void twoThousandNinetyNineShouldNotWin(){
        var game = new DiceGame(2);
        game.createPlayerArr();
        game.setPlayerBalance(2999, 1);
        assertEquals(false, game.verifyWin(1));
    }

    @Test
    public void playerBalanceShouldReturnToZeroIfNegativeAfterRoll(){
        var game = new DiceGame(2);
        game.createPlayerArr();
        game.setPlayerBalance(-10000.0, 1);
        assertEquals(0.0, game.getPlayerBalance(1), 0);
    }

    @Test
    public void playerBalanceShouldReturnToZeroIfNegativeOne(){
        var game = new DiceGame(2);
        game.createPlayerArr();
        game.setPlayerBalance(-1.0, 1);
        assertEquals(0.0, game.getPlayerBalance(1), 0);
    }

    @Test
    public void playerBalanceShouldReturnToZeroIfGoesBelow(){
        var game = new DiceGame(2);
        game.createPlayerArr();
        game.setPlayerBalance(1000.0, 1);
        game.addPlayerBalance(-10001, 1);
        assertEquals(0.0, game.getPlayerBalance(1), 0);
    }
}
