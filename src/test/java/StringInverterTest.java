import org.junit.Test;

import static org.junit.Assert.*;

public class StringInverterTest {
    @Test
    public void stringInverter() {
        StringDrink drink = new StringDrink("ABCD");
        StringInverter si = new StringInverter();
        si.execute(drink);
        assertEquals("DCBA", drink.getText());
    }
}