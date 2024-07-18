 //create a program that doesn't require an instance of the class to be called, and a constructor to initialize an instance of the class with a specific value

public class ExampleProgram {
    private int number;
    // Constructor
    public ExampleProgram(int number) {
        this.number = number;
    }
    // Non-static method to double the number
    public int doubleNumber() {
        return number * 2;
    }
    // Static method to display a message
    public static void displayMessage() {
        System.out.println("Welcome to the This Program!");
    }
    // Static method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        // Display a welcome message
        displayMessage();   
        // Create an instance of ExampleProgram
        ExampleProgram example = new ExampleProgram(5); 
       // Call the non-static method
        int doubled = example.doubleNumber();
        System.out.println("Doubled number: " + doubled);
        // Call the static method to add numbers
        int sum = addNumbers(3, 4);
        System.out.println("Sum of 3 and 4: " + sum);
    }
}
