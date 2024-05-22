import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator cal;
    @BeforeEach
    void setUp() {
        cal = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getA() {
        cal.setA(4);
        assertEquals(4,4);
    }

    @Test
    @DisplayName("Check sum of 2 numbers")
    void add() {
        assertEquals(10,cal.Add(7,3));
    }

    @Test
    @DisplayName("Check subtraction of 2 numbers")
    void subtract() {
        assertEquals(2, cal.Subtract(6, 4));
    }

    @Test
    @DisplayName("Check multiplication of 2 numbers")
    void multiply() {
        assertEquals(20, cal.Multiply(4, 5));
    }

    @Test
    @DisplayName("Check division of 2 numbers")
    void divide() {
        assertEquals(2.0, cal.Divide(10, 5));
        assertThrows(ArithmeticException.class, () -> cal.Divide(10, 0));
    }

    @Test
    @DisplayName("Check 2 numbers is both even")
    void testBothNumbersIsEven(){
        assertTrue(cal.testEven(4,5));
    }
}