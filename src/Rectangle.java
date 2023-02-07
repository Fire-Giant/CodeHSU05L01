/**
 * @file Rectangle.java
 * @date 2/2/2023
 * @author Mr. Smith
 *
 * @description Creates a rectangle with a width and height or a square with a side length
 *
 */

import java.text.DecimalFormat;
public class Rectangle { //make public for CS A

    //instance variables
private double width;
private double height;
private double area;
private double perimeter;
    //default constructor (make public for CS A)
public Rectangle(){
    width = 1.0;
    height = 1.0;
}

    /**
     * Creates a Rectangle object with width and height
     *
     * @param w width of the rectangle
     * @param h height of the rectangle
     */
    public Rectangle(double w, double h){
    width = 1.0;
    height = 1.0;
    if(w > 0){
        width = w;
    }
    if(h > 0){
        height = h;
    }

}
public Rectangle(double width){
    this.width = width;
}

    //overloaded constructor (with parameters)



    //accessors

    /**
     * @return the width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Allows the user to change the width of the rectangle.
     * @param newWidth desired width
     */
    //mutators
    public void setWidth(double newWidth)
    {
        width = newWidth;
    }

    /**
     * Modifies the height of the the rectangle
     * @param height
     */
    public void setHeight(double height){
        this.height = height;
    }





    //other methods
/**
 * @description Calculates area of rectangle
 * @return area of rectangle
 */
public double calculateArea() {
    return height * width;
}
/**
 *@description Calculates perimeter of rectangle
 * @return perimeter of rectangle
 */
public double  calculatePerimeter() {
    perimeter = 2 * (width + height);
    return perimeter;
}



public void resetRectangle(){
    width = 1;
    height = 1;
}
    //toString method
/**
 * Prints the height and width of rectangle to 2 decimal places
 */


 public String toString(){
        DecimalFormat df = new DecimalFormat("#.##"); //displays a number with 2 decimal places
     return "The height of the rectangle is " + df.format(height) +
             " and the width is " + df.format(width) + ".";
    }
}