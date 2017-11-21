/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Spyros
 */
public class FileReader {

    Map<String, Integer> wordCount = new HashMap<String, Integer>();

    public void countWords() {
        File file = null;
        Scanner input = null;
        try {

            file = new File("D:\\AJourneyintotheInterioroftheEarth.txt");

            input = new Scanner(file);
        } catch (Exception ex) {
            Logger.getLogger(Exercise3.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (input.hasNext()) {
            String word = input.next();
            if (wordCount.containsKey(word)) {
                // seen this word before; increase count by 1
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                // never seen this word before
                wordCount.put(word, 1);
            }
        }
    }

    public int getWord(String word) {

        return wordCount.containsKey(word) ? wordCount.get(word) : 0;
    }

    public void get500words() {
        ArrayList<String> listwords = new ArrayList<String>();
        Iterator it = wordCount.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            if ((int) me.getValue() > 45) {
                listwords.add((String) me.getKey());
            }
        }
        System.out.println(listwords.toString());
    }
}
