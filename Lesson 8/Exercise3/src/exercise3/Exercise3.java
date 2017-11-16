/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Spyros
 */
class ThreeOverloads {

    public void f(int i) {
        System.out.println("f(int i)");
    }

    public void f(char c) {
        System.out.println("f(char c)");
    }

    public void f(double d) {
        System.out.println("f(double d)");
    }
}

class MoreOverloads extends ThreeOverloads {

    public void f(String s) {
        System.out.println("f(String s)");
    }
}

public class Exercise3 {

    public static void main(String args[]) {
        MoreOverloads mo = new MoreOverloads();
        mo.f(1);
        mo.f('c');
        mo.f(1.1);
        mo.f("Hello");
    }
}
