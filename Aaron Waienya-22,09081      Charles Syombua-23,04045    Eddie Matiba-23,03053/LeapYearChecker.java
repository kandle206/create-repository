//create a program to check   if for a  leap year or not

import java.util.Scanner;
public class LeapYearChecker {
   
 public static void main(String[] args) {
       
 Scanner scanner = new Scanner(System.in);
      
 //let the user input a year 
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }
        scanner.close();
    }
}
