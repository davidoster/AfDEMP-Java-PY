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
public abstract class Phone {

    private String brand;

    public double phonePrice = 0;

    public Phone(String mybrand) {
        brand = mybrand;
    }

    public String getBrand() {
        return brand;
    }

    public double getPhonePrice() {
        return phonePrice;
    }

    public abstract void setPhonePrice();

}
