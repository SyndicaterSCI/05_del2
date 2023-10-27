import static org.junit.Assert.assertEquals;

import org.junit.*;

public class DieTest {
    
    @Test
    public void rollShouldBeBetweenOneAndSix(){
        var d1 = new Die(1, 6);
        boolean test = true;

        for(int i = 0; i < 1000; i++){
            d1.roll();
            int result = d1.getFaceValue();
            if(result < 1 || result > 6){
                test = false;
            }
        }

        assertEquals(true, test);
    }
}
