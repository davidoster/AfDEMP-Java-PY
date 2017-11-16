/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Spyros
 */
public abstract class Division {

    private String name;
    private int accountNuber;

    public Division(String name, int accountNuber) {
        this.name = name;
        this.accountNuber = accountNuber;
    }

    public String getName() {
        return name;
    }

    public int getAccountNuber() {
        return accountNuber;
    }

    public abstract void display();

}
