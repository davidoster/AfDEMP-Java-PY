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
public class Android extends Phone {

    public Android(String title) {
        super(title);
        setPhonePrice();
    }

    public void setPhonePrice() {
        phonePrice = 24.99;
    }

}
