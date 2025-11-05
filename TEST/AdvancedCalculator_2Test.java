import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculator_2Test {
    // AdvancedCalculator_2 advancedCalc2;

    @Test
    void C(){
        AdvancedCalculator_2 calc2 = new AdvancedCalculator_2();
        calc2.setC("clear");
        assertEquals(0,calc2.getResult());
    }

}