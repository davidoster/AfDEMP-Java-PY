/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2Code;

/**
 *
 * @author Spyros
 */
public class IntroductionToJAVACode {

    public static void main(String[] args) {
        //------------Example of static variable ---------------------------
        TestClass t1 = new TestClass(6);
        TestClass t2 = new TestClass(9);
        TestClass t3 = new TestClass();

        t1.i = 2;
        System.out.println(t1.i);
        System.out.println(t2.i);
        System.out.println(t3.i);
        
        System.out.println(t1.mybyte);
        byte a = 22;
        t2.setMyByte(a); t2.setMyByte((byte)22);
        System.out.println(t2.mybyte);
        System.out.println(t3.mybyte);

        //------------------- Assigment example ------------------------------
        int j, k;
        j = 4;
        k = 3;

        k = +j;
        System.out.println("k=+j " + k + " " + j);

        //-------------------Switch statement example---------------------------------
        int temp = 2;
        System.out.println("-----Begining switch example-----------");
        switch (temp) {
            case 1: {
                System.out.println("1\n");
                break;
            }
            case 2: {
                System.out.println("2\n");

            }
            case 3: {
                System.out.println("3\n"); // Why we see 2 in output?? Because case 2 has no break statement
            }
        }

        // ------------------String Examples ------------------------------
        // ----------------check for equality--------------------
        String test1 = new String("Welcome");
        String test2 = new String("Welcome");
        
        System.out.println("Is test1 == test2 " + (test1 == test2 ? "yes" : "no"));
        System.out.println("Is test1 equals test2 " + (test1.equals(test2) ? "yes" : "no"));

        //------------immutability----------------------------------
        String s = "Java";
        s.concat(" is great");//concat() method appends the string at the end  
        System.out.println(s.concat(" is great"));
        System.out.println("It works but doesn't change the value of s");
        System.out.println(s);//will print java because strings are immutable objects  
        System.out.println("No concatenation");

        s = s.concat(" is great");//a new s object is created. Object "Java" is untouched
        System.out.println(s);//will print Java is great because strings are immutable objects 
        System.out.println("New concatenated value is given to s");
        
        String m = "Java";
        m += " is great";
        System.out.println(s);
        
        // Formated Strings
        System.out.println(String.format("%s is %d years old", "Al", 45));

        String str = "Harry";
        int n = str.length();
        String mystery = str.substring(0, 1) + str.substring(n - 1, n);
        System.out.println(mystery);
    }
}
