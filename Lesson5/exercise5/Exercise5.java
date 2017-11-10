/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Spyros
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println("Hello " + name);
        System.out.println("What is your surname?");
        String surname = stdin.nextLine();
        System.out.println("Whats your favorite color?");
        String color = stdin.nextLine();
        System.out.println(color);
        System.out.println("How old are you?");
        System.out.println("(input: <age>)");
        int age = stdin.nextInt();

        stdin.close();
        // Print whats gathered to a file
        System.out.println("printing........");
        try {
            PrintWriter writer = new PrintWriter("thefile.txt", "UTF-8");
            writer.println("Your name is " + name + " and your surname is " + surname);
            writer.println("You are " + age + "years old and your favorite color is" + color);
            writer.close();
            System.out.println("file is ready");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exercise5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Exercise5.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
