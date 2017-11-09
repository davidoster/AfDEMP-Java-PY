/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenate;

import java.util.Scanner;

/**
 *
 * @author davidoster
 */
public class Concatenate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me an integer: ");
        int a = scan.nextInt();
        System.out.println("Give me a string: ");
        String b = scan.next();
        System.out.println("The concatenated a + b: " + a + b);
    }
    
}
