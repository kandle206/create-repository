
//This program checks for prime numbers between 1 and 500

public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (number == 2 || number == 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Numbers divisible by 2 or 3 are not prime (except for 2 and 3 themselves)
        }
        // Check for prime numbers using 6k ± 1 optimization
        int sqrtNum = (int) Math.sqrt(number);
        for (int i = 5; i <= sqrtNum; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; // Number is divisible by i or i + 2, so it's not prime
            }
        }

        return true; // Number is prime if it passes all checks
    }
}
