//create a program that asks the lecturer to enter marks for three units , java programming, networking and maths
//program should compute the avaerage of the 3 units

package lecturer_marks;
import java.util.Scanner;
public class MarksCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for Java Programming:");
        int javaMarks = scanner.nextInt();

        System.out.println("Enter marks for Networking:");
        int networkingMarks = scanner.nextInt();

        System.out.println("Enter marks for Maths:");
        int mathsMarks = scanner.nextInt();

        // Compute the average marks
        double average = (javaMarks + networkingMarks + mathsMarks) / 3.0;

        // Output the data in the specified format
        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + average);
    }
}
