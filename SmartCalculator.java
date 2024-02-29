package simple_interest;
import java.util.Scanner;

public class SmartCalculator {
    private double principal;
    private double rate;
    private double time;

    // Constructors
    public SmartCalculator() {
        this.principal = 0;
        this.rate = 0;
        this.time = 0;
    }

    public SmartCalculator(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    
    public double calculateCompoundInterest() {
        double amount = principal * Math.pow((1 + rate / 100), time);
        return amount - principal;
    }

    
    public double calculateMean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    
    public int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public double calculatePercentage(double obtainedMarks, double totalMarks) {
        return (obtainedMarks / totalMarks) * 100;
    }

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

