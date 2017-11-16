/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author Spyros
 */
public class Insurance {

    private static int count = 0;
    private int code;

    private int duration;

    private Customer customer;

    private static Insurance[] myinsurances = new Insurance[10];

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Insurance.count = count;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //constructor
    public Insurance() {
        code = ++count;
    }

    public int insuranceCost() {
        return 100;
    }

    public static void printInsurances() {
        for (int i = 1; i <= count; i++) {

        }
    }
}
