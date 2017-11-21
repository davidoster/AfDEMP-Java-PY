/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Spyros
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap< Integer, String> tree_map1 = new TreeMap< Integer, String>();

        tree_map1.put(10, "Red");
        tree_map1.put(20, "Green");
        tree_map1.put(40, "Black");
        tree_map1.put(50, "White");
        tree_map1.put(60, "Pink");

        //----------------a----------------------
        System.out.println("Orginal TreeMap content: " + tree_map1);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + tree_map1.headMap(10, true));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + tree_map1.headMap(20, true));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + tree_map1.headMap(70, true));

        //--------------------b--------------------------------------
        SortedMap< Integer, String> sub_tree_map = new TreeMap< Integer, String>();

        System.out.println("Orginal TreeMap content: " + tree_map1);
        sub_tree_map = tree_map1.subMap(20, 40);
        System.out.println("Sub map key-values: " + sub_tree_map);

        //-----------------------------------c----------------------------
        TreeMap<Integer, String> tree_map2 = new TreeMap<Integer, String>();
        tree_map1.putAll(tree_map2);
        System.out.println("After coping map2 to map1: " + tree_map1);
    }

}
