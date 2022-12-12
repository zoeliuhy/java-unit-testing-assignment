package assignment_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator should")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }
    @Test
    @DisplayName("multiply two nums and show the result correctly")
    public void multiplyNums() {
        assertEquals(12.5, calculator.printMultiplyResult(2.5, 5));
    }
    @Test
    @DisplayName("divide two nums and show the result correctly")
    public void divideNums() {
        assertEquals(2, calculator.printDivideResult(10, 5));
    }
    @Test
    @DisplayName("divide by zero should show exception")
    public void divideByZero() {
        assertThrows(ArithmeticException.class, ()->calculator.printDivideResult(10, 0) );
    }
    @Test
    @Disabled
    @DisplayName("sum two nums and show the result correctly")
    public void sumNums() {
        assertEquals(7.5, calculator.printSumResult(2.5, 5));
    }
    @Test
    @DisplayName("subtract two nums and show the result correctly")
    public void subtractNums() {
        assertEquals(-2.5, calculator.printSubtractResult(2.5, 5));
    }

}