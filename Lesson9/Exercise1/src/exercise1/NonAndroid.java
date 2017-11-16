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
public class NonAndroid extends Phone {

    public NonAndroid(String title) {
        super(title);
        setPhonePrice();
    }

    public void setPhonePrice() {
        phonePrice = 37.99;
    }

}
