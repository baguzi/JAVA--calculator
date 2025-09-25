import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 20);
        assertEquals(30, calc.add());
    }

    @Test
    void subtract() {
        Calculator calc = new Calculator();
        calc.setNumbers(20,10);
        assertEquals(10, calc.subtract());

    }

     @Test
     void multiply() {
         Calculator calc = new Calculator();
         calc.setNumbers(10,5);
         assertEquals(50, calc.multiply());

    }

    @Test
    void divide() {
        Calculator calc = new Calculator();
        calc.setNumbers(60,6);
        assertEquals(0,calc.divide());
    }
}