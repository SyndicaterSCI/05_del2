import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class TextTest {
    
    @Test
    public void twelveShouldReturnSixHundredFifty(){
        double result = Text.getValue(12);
        assertEquals(650.0, result, 0);
    }

    @Test
    public void sevenShouldReturnZero(){
        double result = Text.getValue(7);
        assertEquals(0.0, result, 0);
    }

    @Test
    public void twoShouldReturnTwoHundredFifty(){
        double result = Text.getValue(2);
        assertEquals(250.0, result, 0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void thirteenIsOutOfBounds(){
        Text.getValue(13);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void OneIsOutOfBounds(){
        Text.getValue(1);
    }
}
