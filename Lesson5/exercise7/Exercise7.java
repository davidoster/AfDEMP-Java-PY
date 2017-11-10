/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author Spyros
 */
public class Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(subStringSearch("cccccuhisuefweifccc"));
    }
    
    public static String subStringSearch(String str) {
        StringBuilder result = new StringBuilder();
        
        int length = str.length();
        
        for (int i = 0; i < length / 2; i++) {
            char symbol = str.charAt(i);
            if (symbol == str.charAt(length - (i + 1))) {
                result.append(symbol);
            } else {
                break;
            }
        }
        return result.toString();
    }
}
