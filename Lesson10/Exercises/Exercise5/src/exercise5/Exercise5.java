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
public class Exercise5<T> {

    private T a, b, c;

    public Exercise5(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(T a) {
        this.a = a;
    }

    public void setB(T b) {
        this.b = b;
    }

    public void setC(T c) {
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public T getC() {
        return c;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Exercise5<String> h4
//                = new Exercise5<String>("A", "B", "C");
//        System.out.println(h4.getA());
//        System.out.println(h4.getB());
//        System.out.println(h4.getC());
//        h4.setC("D");
//        System.out.println(h4.getC());

        Exercise5<Integer> h4
                = new Exercise5<Integer>(6, 66, 33333);
        System.out.println(h4.getA());
        System.out.println(h4.getB());
        System.out.println(h4.getC());
        h4.setC(4);
        System.out.println(h4.getC());
    }

}
