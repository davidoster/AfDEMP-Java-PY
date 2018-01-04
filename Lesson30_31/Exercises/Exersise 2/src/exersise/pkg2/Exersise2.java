/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exersise.pkg2;

/**
 *
 * @author Spyros
 */
public class Exersise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person arpitPerson = new Person("Kostas");
        Person johnPerson = new Person("Spiros");

        Product samsungMobile = new Product("Samsung", "Mobile", "Not available");

        //When you opt for option "Notify me when product is available".Below registerObserver method
        //get executed    
        samsungMobile.registerObserver(arpitPerson);
        samsungMobile.registerObserver(johnPerson);

        //Now product is available
        samsungMobile.setAvailability("Available");
    }

}
