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
public class DomesticDivision extends Division {

    private String state;

    public DomesticDivision(String state, String name, int accountNuber) {
        super(name, accountNuber);
        this.state = state;
    }

    public void display() {
        System.out.println("Hi ! I am  International Division named " + super.getName() + " at state " + this.state);
    }

}
