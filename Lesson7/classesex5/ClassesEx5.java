/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesex5;

/**
 *
 * @author Spyros
 */
public class ClassesEx5 {

    int i;
    char c;
    private static ClassesEx5 instance = null;

    // Why protected constructor and not private? Remember what protected means
    //private constructor means that class cannot be subclassed 
    protected ClassesEx5() {
        //We choose to print the varables in the constructor. This is'nt necessary 
    }

    public static ClassesEx5 getInstance() {
        if (instance == null) {
            instance = new ClassesEx5();
        }
        return instance;
    }

    public static void main(String[] args) {
        //We call the constructor but we dont assign the new object to a reference variable
        ClassesEx5 cex5 = ClassesEx5.getInstance();

        // Another way to do it.............
//        ClassesEx1 ex1 = new ClassesEx1();
//        System.out.println("i = " + ex1.c);
//        System.out.println("c = [" + ex1.i + ']');
    }

}
