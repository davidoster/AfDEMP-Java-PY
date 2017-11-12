/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

/**
 *
 * @author Spyros
 */
public class Circle {

    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radious, 2);
    }
}
