import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorComponentTest {

    @Test
    public void add_twoPositives_returnsSum() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void add_positiveAndNegative_returnsSum() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.add(5, -4));
    }

    @Test
    public void subtract_positiveFromPositive_returnsDifference() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(8, 5));
    }

    @Test
    public void multiply_twoPositives_returnsProduct() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void multiply_byZero_returnsZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(100, 0));
    }

    @Test
    public void divide_positiveByPositive_returnsQuotient() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    public void divide_negativeByPositive_returnsQuotient() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.divide(-10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_zeroDivisor_throwsIAE() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}