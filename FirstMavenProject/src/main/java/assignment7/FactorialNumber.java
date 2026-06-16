package assignment7;

public class FactorialNumber {
	 // Method to calculate factorial
    static long calculateFactorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Method to print result
    static void printFactorial(int n) {
        long result = calculateFactorial(n);
        System.out.println("Factorial of " + n + " = " + result);
    }

    public static void main(String[] args) {
        int number = 5;

        // Main invokes only one method
        printFactorial(number);
    }
}
