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
import java.util.Observable;
import java.util.Observer;

class Person implements Observer {

    String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void update(Observable arg0, Object arg1) {
        System.out.println("Hello " + personName + ", Product is now " + arg1 + " on myStore");

    }

}
