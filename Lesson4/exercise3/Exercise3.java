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
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int sum, x;
        x = 1;
        sum = 0;
        
        //or sum = sum + x;
        for(x = 1; x <= 100; x++) {
            sum += x;
        }
        System.out.println("The sum is: " + sum);
        System.out.println(args[0]);
        args[0] += args[0];
        System.out.println(args[0]);
    }
}
