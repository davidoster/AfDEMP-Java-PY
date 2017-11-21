/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session8examples;

class BoxPrinter<T> {

    private T val;

    public BoxPrinter(T arg) {
        val = arg;
    }

    public String toString() {
        return "[" + val + "]";
    }

    public T getValue() {
        return val;
    }
}

public class Session8Examples {

    public static void main(String[] args) {

        BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
        System.out.println(value2);
        // OOPs! by mistake, we did put String in an Integer
        //Integer intValue2 = value2.getValue();
    }

}
