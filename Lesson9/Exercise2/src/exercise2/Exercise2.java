/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Spyros
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Phone phones[] = new Phone[10];

        phones[0] = new Android("N3");
        phones[1] = new Android("FR4");
        phones[2] = new NonAndroid("N34");
        phones[3] = new Android("HDFR4");
        phones[4] = new Android("HYHN3");
        phones[5] = new NonAndroid("N3");
        phones[6] = new Android("N3HY");
        phones[7] = new Android("N3F");
        phones[8] = new NonAndroid("N36");
        phones[9] = new NonAndroid("N3");

        for (int i = 0; i < phones.length; i++) {
            System.out.println("Phone number " + (i + 1) + " is " + phones[i].getBrand() + " and costs " + phones[i].getPhonePrice());
        }
    }

}
