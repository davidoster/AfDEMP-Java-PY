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
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {

            String result = "This is" + "testing the" + "difference" + "between"
                    + "String" + "and" + "StringBuffer";

        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken for string concatenation using + operator : "
                + (endTime - startTime) + " milli seconds");

        //Test the StringBuffer Concatination
        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {

            StringBuffer result = new StringBuffer();

            result.append("This is");

            result.append("testing the");

            result.append("difference");

            result.append("between");

            result.append("String");

            result.append("and");

            result.append("StringBuffer");

        }

        long endTime1 = System.currentTimeMillis();

        System.out.println("Time taken for String concatenation using StringBuffer : "
                + (endTime1 - startTime1) + " milli seconds");

    }
}
