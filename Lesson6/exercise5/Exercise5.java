/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import java.util.Scanner;

/**
 *
 * @author Spyros
 */
public class Exercise5 {

    static int n1 = 0, n2 = 1, n3 = 0;

    public static void fibonacciRecusion(int number) {

        if (number > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacciRecusion(number - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Using recursion");
        fibonacciRecusion(number);
    }

}
