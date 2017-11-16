/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author Spyros
 */
class Base1 {

    public Base1() {
        System.out.println("Base1");
    }
}

class Derived1 extends Base1 {

    public Derived1() {
        System.out.println("Derived1");
    }
}

class Derived2 extends Derived1 {

    public Derived2() {
        System.out.println("Derived2");
    }
}

public class Exercise2 {

    public static void main(String args[]) {
        new Derived2();
    }
}
