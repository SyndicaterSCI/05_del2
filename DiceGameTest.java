import static org.junit.Assert.assertEquals;

import org.junit.*;

public class DiceGameTest {
    
    @Test
    public void test1(){
        boolean test = true;
        var game = new DiceGame();
        game.creatDie();
        game.createPlayer();
        
        for(int i = 0; i < 1000; i++){
            game.roll(1);
            
        }
        
    }
}
