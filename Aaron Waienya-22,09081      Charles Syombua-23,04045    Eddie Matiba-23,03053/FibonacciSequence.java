// This  program prints the first n numbers of a Fibonacci-like sequence starting with 1 and 2.

public class FibonacciSequence {

    public static void main(String[] args) {
        int n = 10; // Number of terms to generate
        generateFibonacci(n);
    }

    // Method to generate the first n terms of the Fibonacci sequence
    public static void generateFibonacci(int n) {
        int a = 1; // First Fibonacci number
        int b = 2; // Second Fibonacci number
        
        System.out.print("First " + n + " terms of Fibonacci sequence: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
