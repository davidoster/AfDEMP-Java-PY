/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesex1;

/**
 *
 * @author Spyros
 */
public class ClassesEx1 {

    int i;
    char c;

    public ClassesEx1() {
        //We choose to print the varables in the constructor. This is'nt necessary 
        System.out.println("i = " + i);
        System.out.println("c = [" + c + ']');
    }

    public static void main(String[] args) {
        //We call the constructor but we dont assign the new object to a reference variable
        new ClassesEx1();

        // Another way to do it.............
//        ClassesEx1 ex1 = new ClassesEx1();
//        System.out.println("i = " + ex1.c);
//        System.out.println("c = [" + ex1.i + ']');
    }

}
