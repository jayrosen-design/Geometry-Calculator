//****************************************************************************** 
// Jay Rosen
// 10/24/14
// COP2660.0M1
// Module 7 : GeometryCalculator_j_rosen.java
//
// This program calculates the area of circle, rectangle, and triangle.
//******************************************************************************

import java.util.Scanner;

public class GeometryCalculator_j_rosen 
{
 public static void main(String[] args) 
 {
    // Initalize choice of menu option
    int choice = getMenu(); 
    
        //Menu option 1 to calculate area of circle
        if (choice == 1)  
            calculateCircleArea();
       
       //Menu option 2 to calculate area of rectangle     
        else if (choice == 2) 
            calculateRectangleArea();
        
        //Menu option 3 to calculate area of triangle   
        else if (choice == 3) 
            calculateTriangleArea();

        //Menu option 4 to quit program
        else if (choice == 4) 
            System.out.println("Bye!");
 }

   /**  getMenu()method displays menu of options to calculate area of different shapes.
        @return userChoice The user input for menu selection.*/

   public static int getMenu()
   {
   
    //choice of menu option
    int userChoice;
    
    Scanner keyboard = new Scanner(System.in);
    
    //Display menu of options and prompt user for input
    System.out.println("Geometry Calculator\n");
    System.out.println("1. Calculate the Area of a Circle");
    System.out.println("2. Calculate the Area of a Rectangle");
    System.out.println("3. Calculate the Area of a Triangle");
    System.out.println("4. Quit\n");
    System.out.print("Enter your choice : ");
    
    //User input
    userChoice = keyboard.nextInt();

    //Validate input
    while (userChoice < 1 || userChoice > 4) 
    {
        System.out.print("ERROR: Please enter a valid choice: 1 - 4 ");
        userChoice = keyboard.nextInt();
    }

    return userChoice;
   }


   /**  calculateCircleArea() method prompts user to enter radius to calculate area of circle. */

   public static void calculateCircleArea() 
   {

    //Hold radius of circle
    double radius;

    //Prompt user for radius of circle
    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is the circle's radius? ");
    radius = keyboard.nextDouble();

    //Display area of circle
    System.out.println("The circle's area is " + Geometry_j_rosen.areaOfCircle(radius));
   }

   /**  calculateRectangleArea() method prompts user to enter legnth and width to calculate area of rectangle. */


   public static void calculateRectangleArea()
   {
    //Hold length and width of rectangle
    double length;
    double width;

    Scanner keyboard = new Scanner(System.in);

    //Prompt user to enter length and width of rectangle.
    System.out.print("Enter length? ");
    length = keyboard.nextDouble();

    System.out.print("Enter width? ");
    width = keyboard.nextDouble();

   //Display area of rectnagle
    System.out.println("The rectangle's area is " + Geometry_j_rosen.areaOfRectangle(length, width));
   }

   /**  calculateTriangleArea() method prompts user to enter base and height to calculate area of triangle. */

   public static void calculateTriangleArea() 
   {
    //Hold base and height of triangle
    double base;
    double height;

    Scanner keyboard = new Scanner(System.in);

   //Prompt user to input base and height of triangle
    System.out.print("Enter length of the triangle's base? ");
    base = keyboard.nextDouble();

    System.out.print("Enter triangle's height? ");
    height = keyboard.nextDouble();

   //Display area of triangle
    System.out.println("The triangle's area is " + Geometry_j_rosen.areaOfTriangle(base, height));
   }


}