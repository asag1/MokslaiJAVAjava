import BowlingGame.BowlingGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {


    @Test
    public void testBowlingGame_firstThrow4_results4() {
        BowlingGame bowlingGame = BowlingGame.startGame();
        bowlingGame.throwBall(4);
        assertEquals(4, bowlingGame.curreentScore());

    }
}