//****************************************************************************** 
// Jay Rosen
// 10/24/14
// COP2660.0M1
// Module 7 : convert_j_rosen.java
//
// This program calculates the area of circle, rectangle, and triangle.
//******************************************************************************

import java.util.Scanner;

public class GeometryTester 
{
 public static void main(String[] args) 
 {
    int choice; //Choice of menu option
    
    choice = getMenu();

        if (choice == 1)  
            calculateCircleArea();
            
        else if (choice == 2) 
            calculateRectangleArea();
            
        else if (choice == 3) 
            calculateTriangleArea();

        else if (choice == 4) 
            System.out.println("Bye!");
    
}


 /**  getMenu()method displays menu of options to calculate area of different shapes.
      @return userChoice The user input for menu selection.*/

public static int getMenu()
{
    int userChoice;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Geometry Calculator\n");
    System.out.println("1. Calculate the Area of a Circle");
    System.out.println("2. Calculate the Area of a Rectangle");
    System.out.println("3. Calculate the Area of a Triangle");
    System.out.println("4. Quit\n");
    System.out.print("Enter your choice : ");
    
    userChoice = keyboard.nextInt();

    while (userChoice < 1 || userChoice > 4) //Validate input
    {
        System.out.print("ERROR: Please enter a valid choice: 1 - 4 ");
        userChoice = keyboard.nextInt();
    }

    return userChoice;
}


 /**  calculateCircleArea() method prompts user to enter radius to calculate area of circle. */


public static void calculateCircleArea() 
{

    double radius;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is the circle's radius? ");
    radius = keyboard.nextDouble();

    System.out.println("The circle's area is " + Geometry.areaOfCircle(radius));
}

 /**  calculateRectangleArea() method prompts user to enter legnth and width to calculate area of rectangle. */


public static void calculateRectangleArea()
{
    double length;
    double width;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter length? ");
    length = keyboard.nextDouble();

    System.out.print("Enter width? ");
    width = keyboard.nextDouble();


    System.out.println("The rectangle's area is " + Geometry.areaOfRectangle(length, width));
}

/**  calculateTriangleArea() method prompts user to enter base and height to calculate area of triangle. */

public static void calculateTriangleArea() 
{

    double base;
    double height;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter length of the triangle's base? ");
    base = keyboard.nextDouble();

    System.out.print("Enter triangle's height? ");
    height = keyboard.nextDouble();

    System.out.println("The triangle's area is " + Geometry.areaOfTriangle(base, height));
}

}