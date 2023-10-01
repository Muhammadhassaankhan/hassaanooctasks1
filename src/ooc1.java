import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a non-negative integer
        System.out.print("Enter a positive number please: ");
        int n = scanner.nextInt();  // Read the input integer

        // Check if the entered number is negative
        if (n < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
        } else {
            // Calculate the factorial of the entered number
            long factorial = calculateFactorial(n);

            // Display the result
            System.out.println("Factorial of " + n + " is " + factorial);
        }

        // Close the scanner to release resources
        scanner.close();
    }

    // Recursive method to calculate the factorial of a number
    public static long calculateFactorial(int n) {
        // Base case: factorial of 0 and 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: calculate factorial
