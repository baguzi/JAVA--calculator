
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    @Test
    void testChangesBinary() {
        ScientificCalculator calc = new ScientificCalculator();


        calc.result = 10;
        assertEquals("1010", calc.changesBinary());

        calc.result = 8;
        assertEquals("1000", calc.changesBinary());


    }



}
