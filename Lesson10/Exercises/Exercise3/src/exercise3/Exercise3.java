/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.Scanner;

/**
 *
 * @author Spyros
 */
public class Exercise3 {

    public static void main(String[] args) {
        FileReader fr = new FileReader();
        fr.countWords();
        // System.out.println(fr.wordCount);

        Scanner console = new Scanner(System.in);
        System.out.print("Word to search for? ");
        String word = console.next();

        System.out.println("appears " + fr.getWord(word) + " times.");
        // print words that apperas more than 500 times
        fr.get500words();

    }

}
