//The program checks if each number in an array is a palindrome

public class PalindromeChecker {

    public static void main(String[] args) {
        // Example numbers to test
        int[] numbers = {121, 12321, 12345, 123321, 123454321};

        for (int num : numbers) {
            System.out.print(num + " is ");
            if (isPalindrome(num)) {
                System.out.println("a palindrome.");
            } else {
                System.out.println("not a palindrome.");
            }
        }
    }

    // Method to check if a number is palindrome
   
 private static boolean isPalindrome(int num) {
        // Convert number to string to check palindrome
        String str = String.valueOf(num);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}