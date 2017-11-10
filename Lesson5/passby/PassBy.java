/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passby;

/**
 *
 * @author Spyros
 */
public class PassBy {

    public static int k;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        foo(aDog);
        System.out.println("Name is changed " + aDog.getName());
        Dog aDog1 = new Dog("Azor");
        foo2(aDog1);
        System.out.println("Name is not changed " + aDog1.getName());
        k = 3;
        foo1(k);
        System.out.println("K is not changed " + k);
    }

    public static void foo(Dog d) {
        d.setName("Fifi");
        //d = null;
    }

    public static void foo1(int i) {
        i = i + 1;
    }

    public static void foo2(Dog d) {
        Dog newDog = new Dog("Fifi");
        d = newDog;

    }
}

class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
