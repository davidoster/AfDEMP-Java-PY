/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author Spyros
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android aphone = new Android("Samsung J4");

        NonAndroid nphone = new NonAndroid("Nokia 435");
        System.out.println(aphone.getBrand() + " " + aphone.getPhonePrice());
        System.out.println(nphone.getBrand() + " " + nphone.getPhonePrice());
    }

}
