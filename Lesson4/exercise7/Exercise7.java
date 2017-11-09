/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author Spyros
 */
public class Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int is = 0, isnt = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 != 0) {
                is++;
                System.out.println(i + " is in the list");
            } else {
                isnt++;
                System.out.println(i + " isn't in the list");
            }
        }
        System.out.printf("There are: %d numbers in the list and %d numbers that are not in the list\n",is,isnt);
    }
}
