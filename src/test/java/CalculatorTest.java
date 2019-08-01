import org.junit.Test;
import utils.BigIntegerAlgorithm;
import utils.CustomAlgorithm;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testOutputWithBigIntAlgorithm() {
        assertEquals("137174210013717420998628257899862825790",
                BigIntegerAlgorithm.multiply("12345678901234567890", "11111111111111111111"));
    }

    @Test
    public void testOutputWithCustomAlgorithm() {
        assertEquals("137174210013717420998628257899862825790",
                CustomAlgorithm.multiply("12345678901234567890", "11111111111111111111"));
    }
}
