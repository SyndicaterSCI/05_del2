import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {
    
    @Test
    public void addSum(){
        var p1 = new Player("Tester");
        p1.addSum(50);
        p1.addSum(100);
        assertEquals(150.0, p1.getBalance(), 0);
    }

    @Test
    public void subtractSum(){
        var p1 = new Player("Tester");
        p1.subtractSum(50);
        p1.subtractSum(100);
        assertEquals(-150.0, p1.getBalance(), 0);
    }
}
