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
        Piano p = new Piano();
        Violin v = new Violin();
        Drum d = new Drum();

        p.outputSound();
        d.playNote();
    }

}
