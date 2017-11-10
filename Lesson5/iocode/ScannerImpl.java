/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iocode;

import java.util.Scanner;

/**
 *
 * @author Spyros
 */
public class ScannerImpl {

    Scanner keyboard = new Scanner(System.in);

    protected void readfrom() {
        System.out.println("Scanner enter an integer");
        int myint = keyboard.nextInt();
        System.out.println("enterd " + myint);
        keyboard.close();
    }

}
