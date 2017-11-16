/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

/**
 *
 * @author Spyros
 */
public class Sub extends Super {

    int x = 3;

    public int method(int x, int x2) {
        return (this.x * 2) + (x + x2 + super.x);
    }

    public static void main(String[] args) {
        Super s = new Sub();

        System.out.println("--------------------------------------------");

        Super s1 = new Super();
        System.out.println("--------------------------------------------");

        Sub s2 = new Sub();
    }
}
