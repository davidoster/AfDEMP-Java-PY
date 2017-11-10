/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exesrcise4;

import static java.lang.String.format;
import java.util.Locale;

/**
 *
 * @author Spyros
 */
public class Exercise4 {

    int intField = 1;
    long longField = 2L;
    float floatField = 3.0f;
    double doubleField = 4.0;

    public String toString() {
        StringBuilder result = new StringBuilder("DataHolder: \n");
        result.append(format(Locale.getDefault(), "intField: %d\n", intField));
        result.append(format(Locale.ENGLISH, "longField: %d\n", longField));
        result.append(format(Locale.US, "floatField: %f\n", floatField));
        result.append(format(Locale.US, "doubleField: %e\n", doubleField));
        return result.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercise4 ex4 = new Exercise4();
        System.out.println(ex4.toString());
    }
}
