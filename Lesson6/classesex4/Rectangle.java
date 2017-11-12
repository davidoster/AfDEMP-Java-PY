/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesex4;

/**
 *
 * @author Spyros
 */
public class Rectangle {

    private double length, width;

// constructor without paramters default values 1.0
    public Rectangle() {
        setLength(1.0);
        setWidth(1.0);
    }

    // constructor with length and width supplied
    public Rectangle(double theLength, double theWidth) {
        setLength(theLength);
        setWidth(theWidth);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        /* 
        We use the setter method to verify the values. length is private, so it can only be changed through here
         */

        //Why we use this.length? We must be careful to distinguish between the parameter length  and the
        //instance variable length. this.length means length the instance variable,
        //We could avoid that by renaming the paramter name (mylength ...)
        this.length = (length > 0.0 && length < 20.0 ? length : 1.0);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width > 0 && width < 20.0 ? width : 1.0);
    }

    // calculate rectangle's perimeter
    public double perimeter() {
        return 2 * length + 2 * width;
    }

    // calculate rectangle's area
    public double area() {
        return length * width;
    }

}
