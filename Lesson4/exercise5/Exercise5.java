/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author Spyros
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum, x;

        x = 1;
        sum = 0;

        while (x <= 10) {
            //System.out.print(x + " ");
            sum += x;
            ++x;
            //System.out.print(++x  + " ");
        }
        System.out.println("The sum is: " + sum);
    }
}
