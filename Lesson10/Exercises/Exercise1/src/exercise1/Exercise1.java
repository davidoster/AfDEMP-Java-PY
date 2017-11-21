/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Spyros
 */
class Bunny {

    private final int bunnyNumber;

    Bunny(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public String toString() {
        return "gerbil " + bunnyNumber;
    }

    public void hop() {
        System.out.println(this + " is hopping");
    }
}

public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Bunny> bunnys = new ArrayList<Bunny>();
        for (int i = 0; i < 10; i++) {
            bunnys.add(new Bunny(i));
        }
        //using for
        for (int i = 0; i < bunnys.size(); i++) {
            bunnys.get(i).hop();
        }
//using Iterator
        Iterator<Bunny> it = bunnys.iterator();
        while (it.hasNext()) {
            it.next().hop();
        }
    }
}
