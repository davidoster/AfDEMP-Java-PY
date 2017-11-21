/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session9codeexamples;

/**
 *
 * @author Spyros
 */
public class Session9CodeExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");

        if (s1 == s2) {
            System.out.println("s1 == s2 is TRUE");
        }
        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2) is TRUE");
        }

        String s3 = "java";
        String s4 = "java";

        if (s1.equals(s3)) {
            System.out.println("s1.equals(s3) is TRUE");
        }
        if (s1 == s3) {
            System.out.println("s1==s3 is TRUE"); // Explain why this is happening
        }

        if (s3 == s4) {
            System.out.println("s3 == s4 is TRUE");
        }
        if (s3.equals(s4)) {
            System.out.println("s3.equals(s4) is TRUE");
        }

        Car c = new Car();
        c.brand = "Volvo";
        c._4wd = true;
        Car c1 = new Car();
        c.brand = "Volvo";
        c1._4wd = true;

        Vehicle v = new Vehicle();
        v.brand = "Volvo";
        System.out.println(c.equals(v));
        System.out.println(c == v);
        System.out.println(c.equals(c1));
        System.out.println(c == c1);

        // Primitives - Wrapper classes examples
        Integer i = new Integer(5);
        Integer k = new Integer(5);

        if (i == k) {
            System.out.println("i == k is TRUE");
        }
        if (i.equals(k)) {
            System.out.println("i.equals(k) is TRUE");
        }

        int i1 = 81;
        int i2 = 81;

        if (i1 == i2) {
            System.out.println("i1 == i2 is TRUE");
        }
//        if (i1.equals(i2)) { NO EQUALS HERE
//            System.out.println("i.equals(i2) is TRUE");
//        }

    }
}
