/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author Spyros
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myarray = {14, 2, 3, 34, 5, 6, 72, 8, 91, 101, 11};

        // first to last
//        for (int i = 0; i < myarray.length; i++) {
//            System.out.println(myarray[i]);
//        }
        // last to first
        System.out.println("Reverse order\n");
        for (int i = (myarray.length - 1); i >= 0; i--) {
            System.out.println(myarray[i]);
        }

        //Determine and print the smallest and largest values 
        int small = myarray[0];
        int large = myarray[0];
        // Why not small, large = 0?
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] < small) {
                small = myarray[i];
            } else if (myarray[i] > large) {
                large = myarray[i];
            }
        }
        System.out.println("\nSmallest: " + small + " Largest: " + large);
    }
}
