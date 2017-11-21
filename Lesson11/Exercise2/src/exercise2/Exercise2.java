/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Spyros
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create String literals

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {

            String s1 = "hello";

            String s2 = "hello";

        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken for creation of String literals : "
                + (endTime - startTime) + " milli seconds");

        // create String objects using 'new' keyword       
        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {

            String s3 = new String("hello");

            String s4 = new String("hello");

        }

        long endTime1 = System.currentTimeMillis();

        System.out.println("Time taken for creation of String objects : "
                + (endTime1 - startTime1) + " milli seconds");
    }

}
