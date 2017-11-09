/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

/**
 *
 * @author Spyros
 */
public class Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Declaring a variable "test" and initializing it with a value 444
        int test = 444;

        if (test == 7) {
            //This block will be executed only if "test" is equal to 7
            System.out.println("Hello");
        } else if (test == 10) {
            //This block will be executed only if "test" is equal to 10
            System.out.println("Hi");
        } else if (test == 444) {
            //This block will be executed only if "test" is equal to 444
            System.out.println("Good");
        } else {
            System.out.println("No Match Found");
        }
    }
}
