//****************************************************************************** 
// Jay Rosen
// 10/24/14
// COP2660.0M1
// Module 7 : convert_j_rosen.java
//
// This class holds formulas to calculate the area of circle, rectangle, and triangle.
//******************************************************************************


public class Geometry 
{
    /** The areaOfCircle method accepts an argument that is stored in the radius field.
        @param radius The user input radius of circle. 
        @return (Math.Pi * radius * radius) The formula to calculate area of circle. */

    public static double areaOfCircle(double radius) 
    {
        return (Math.PI * radius * radius);
    }

   /** The areaOfRectangle method accepts an argument that is stored in the length and width fields.
       @param length The user input legnth of rectangle.
       @param width The user input width of rectangle.
       @return (legnth * width) The formula to calculate the area of rectangle. */

    public static double areaOfRectangle(double length, double width) 
    {
        return (length * width);
    }
    
    /** The areaOfTriangle method accepts an argument that is stored in the base and height fields.
        @param base The user input base of triangle.
        @param height The user input height of triangle.
        @return (base * height * 0.5) The formula to calculate the area of triangle. */

    public static double areaOfTriangle(double base, double height) 
    {
        return (base * height * 0.5);
    }
}