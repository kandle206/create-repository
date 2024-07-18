//The program works with an array of 15 numbers, prints them, finds a specific number, reverses the array, and calculates the total and product of all the numbers

public class Array{
    public static void main(String[] args) {
        // Store 15 predefined integers in an array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Print the values stored in the array
        System.out.println("Values stored in the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 

        // Check if a number exists in the array
        int numberToSearch = 12;
        boolean found = false;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("The number " + numberToSearch + " found at index " + index);
        } else {
            System.out.println("Number not found in this array.");
        }

        // Create a new array with elements in reverse order
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }

        // Print the reverse array
        System.out.println("Elements of the new array in reverse order:");
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i] + " ");
        }
        System.out.println();  

        // Calculate sum and product of all elements in the original array
        int sum = 0;
        long product = 1;  
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            product *= array[i];
        }

        // Print sum and product
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}