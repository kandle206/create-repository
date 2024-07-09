import java.util.Scanner;

public class ExamProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ass1 = 0, ass2 = 0, ass3 = 0, cat1 = 0, cat2 = 0;
        double coursework = 0, finalExam = 0, totalScore = 0;
        int choice = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. View coursework results");
            System.out.println("2. View exam results");
            System.out.println("3. Exit the program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter marks for Assignment 1: ");
                ass1 = scanner.nextDouble();
                System.out.print("Enter marks for Assignment 2: ");
                ass2 = scanner.nextDouble();
                System.out.print("Enter marks for Assignment 3: ");
                ass3 = scanner.nextDouble();
                System.out.print("Enter marks for CAT 1: ");
                cat1 = scanner.nextDouble();
                System.out.print("Enter marks for CAT 2: ");
                cat2 = scanner.nextDouble();

                coursework = ass1 + ass2 + ass3 + cat1 + cat2;
                System.out.println("Coursework results: " + coursework + " out of 50");

                if (computeCourseworkAssessments(ass1, ass2, ass3, cat1, cat2) >= 3) {
                    System.out.println("Student has completed 2/3 of the coursework.");
                } else {
                    System.out.println("Student has not completed 2/3 of the coursework and must repeat.");
                }
            } else if (choice == 2) {
                System.out.print("Enter final exam marks: ");
                finalExam = scanner.nextDouble();

                totalScore = finalExam + coursework;
                System.out.println("Total score: " + totalScore + " out of 100");
            } else if (choice == 3) {
                System.out.println("Exiting the program...");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static int computeCourseworkAssessments(double ass1, double ass2, double ass3, double cat1, double cat2) {
        double[] assessments = {ass1, ass2, ass3, cat1, cat2};
        int count = 0;

        for (double assessment : assessments) {
            if (assessment > 0) {
                count++;
            }
        }
        return count;
    }
}
