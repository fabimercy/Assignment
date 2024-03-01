package simple_interest;
import java.util.Scanner;


/**
 *  A SmartCalculator class that provides various mathematical calculations.
 */

public class SmartCalculator {
    private double principal;
    private double rate;
    private double time;

/**
 * Constructs a SmartCalculator object with default values for principal, rate, and time.
 */
    public SmartCalculator() {
        this.principal = 0;
        this.rate = 0;
        this.time = 0;
    }
    /**
     * Constructs a SmartCalculator object with specified values for principal, rate, and time.
     *
     * @param principal The principal amount.
     * @param rate      The rate of interest.
     * @param time      The time period.
     */
    public SmartCalculator(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }
    /**
     * Gets the principal amount.
     *
     * @return The principal amount.
     */

    
    public double getPrincipal() {
        return principal;
    }
    /**
     * Sets the principal amount.
     *
     * @param principal The principal amount to set.
     */
    public void setPrincipal(double principal) {
        this.principal = principal;
    }
    /**
     * Gets the rate of interest.
     *
     * @return The rate of interest.
     */
    public double getRate() {
        return rate;
    }
    /**
     * Sets the rate of interest.
     *
     * @param rate The rate of interest to set.
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Gets the time period.
     *
     * @return The time period.
     */
    public double getTime() {
        return time;
    }

    /**
     * Sets the time period.
     *
     * @param time The time period to set.
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * Calculates the simple interest.
     *
     * @param principal The principal amount.
     * @param rate      The rate of interest.
     * @param time      The time period.
     * @return The simple interest.
     */
    
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }


    /**
     * Calculates the compound interest.
     *
     * @return The compound interest.
     */ 
    public double calculateCompoundInterest() {
        double amount = principal * Math.pow((1 + rate / 100), time);
        return amount - principal;
    }

    /**
     * Calculates the mean of an array of numbers.
     *
     * @param numbers The array of numbers.
     * @return The mean of the numbers.
     */
    public double calculateMean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    /**
     * Calculates the factorial of a number.
     *
     * @param n The number for which factorial is to be calculated.
     * @return The factorial of the number.
     */
    public int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    /**
     * Calculates the percentage.
     *
     * @param obtainedMarks The marks obtained.
     * @param totalMarks    The total marks.
     * @return The percentage.
     */
    public double calculatePercentage(double obtainedMarks, double totalMarks) {
        return (obtainedMarks / totalMarks) * 100;
    }
    /**
     * Main method to test the SmartCalculator class.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartCalculator calculator = new SmartCalculator();

        System.out.println("Enter amount to calculate simple interest:");
        double principal = scanner.nextDouble();
        calculator.setPrincipal(principal);
        System.out.println("Enter rate of interest:");
        double rate = scanner.nextDouble();
        calculator.setRate(rate);
        System.out.println("Enter time in years:");
        double time = scanner.nextDouble();
        calculator.setTime(time);

        System.out.println("Simple Interest: " + calculator.calculateSimpleInterest(calculator.getPrincipal(), calculator.getRate(), calculator.getTime()));

        System.out.println("Enter amount for compound interest:");
        principal = scanner.nextDouble();
        calculator.setPrincipal(principal);
        System.out.println("Enter rate of interest:");
        rate = scanner.nextDouble();
        calculator.setRate(rate);
        System.out.println("Enter time in years:");
        time = scanner.nextDouble();
        calculator.setTime(time);

        System.out.println("Compound Interest: " + calculator.calculateCompoundInterest());

        System.out.println("Enter the total numbers of input:");
        int count = scanner.nextInt();
        double[] numbers = new double[count];
        System.out.println("Enter the numbers to calculate mean:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextDouble();
        }

        System.out.println("Mean: " + calculator.calculateMean(numbers));

        System.out.println("Enter a number to find factorial:");
        int factorialInput = scanner.nextInt();

        System.out.println("Factorial: " + calculator.calculateFactorial(factorialInput));

        System.out.println("Enter total marks:");
        double totalMarks = scanner.nextDouble();
        System.out.println("Enter marks obtained:");
        double obtainedMarks = scanner.nextDouble();

        System.out.println("Percentage: " + calculator.calculatePercentage(obtainedMarks, totalMarks) + "%");

        scanner.close();
    }
}

