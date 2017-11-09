/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparevalues;

import java.util.Scanner;

/**
 *
 * @author davidoster
 */
public class CompareValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int first = 0;
        int second = 0;
        int third = 0;
        
        Scanner scan = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Give me the first integer: ");
            first = scan.nextInt();

            System.out.println("Give me the second integer: ");
            second = scan.nextInt();

            System.out.println("Give me the third integer: ");
            third = scan.nextInt();

            if((second > first * 3) && (third > first + second)) {
                System.out.println("Great you meet the requirements");
                break;
            }
            else
                System.out.println("Too bad!");
        }
    }
}
