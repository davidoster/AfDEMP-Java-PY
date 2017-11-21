/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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

public class Exercise2 {

    public static void main(String[] args) {
        Map<String, Bunny> map = new HashMap<String, Bunny>();
        map.put("Fuzzy", new Bunny(1));
        map.put("Spot", new Bunny(2));
        map.put("Joe", new Bunny(3));
        map.put("Ted", new Bunny(4));
        map.put("Heather", new Bunny(5));

        // Get Set from Map. The set is made of Map.Entry Objects
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.print(entry.getKey() + ": ");
            //Value of the Map.Entry is an Object (Bunny). We need to cast
            ((Bunny) entry.getValue()).hop();
        }
    }

}
