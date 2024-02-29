package simple_interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmartCalculatorTest {

	public void testCalculateSimpleInterest() {
        SmartCalculator calculator = new SmartCalculator();
        assertEquals(500.0, calculator.calculateSimpleInterest(1000, 5, 10), 0.001);
    }

    @Test
    public void testCalculateCompoundInterest() {
        SmartCalculator calculator = new SmartCalculator();
        calculator.setPrincipal(1000);
        calculator.setRate(5);
        calculator.setTime(10);
        assertEquals(648.84, calculator.calculateCompoundInterest(), 0.01);
    }

    @Test
    public void testCalculateMean() {
        SmartCalculator calculator = new SmartCalculator();
        double[] numbers = { 1, 2, 3, 4, 5 };
        assertEquals(3.0, calculator.calculateMean(numbers), 0.001);
    }

    @Test
    public void testCalculateFactorial() {
        SmartCalculator calculator = new SmartCalculator();
        assertEquals(120, calculator.calculateFactorial(5));
    }

    @Test
    public void testCalculatePercentage() {
        SmartCalculator calculator = new SmartCalculator();
        assertEquals(75.0, calculator.calculatePercentage(75, 100), 0.001);
    }

}
