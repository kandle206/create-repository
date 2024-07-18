//This program should be ale to calculate the area of a triangle;

package mypackage;

import java.util.Scanner;
public class TriangleArea {
    public double base;
    public double height;
    public double area;
  
public static void main(String[] args) {
        TriangleArea triangle = new TriangleArea();
        triangle.askUserForDimensions();
        triangle.computeArea();
        triangle.displayArea();
    }
   
// Method to ask the user for the base and height of the triangle
    public void askUserForDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        height = scanner.nextDouble();
        scanner.close();
    }
 
// Method to compute the area of the triangle
    public void computeArea() {
        area = 0.5 * base * height;    }
 
 // Method to display the area of the triangle
    public void displayArea() {
        System.out.println("The area of the triangle is: " + area);
}
}
