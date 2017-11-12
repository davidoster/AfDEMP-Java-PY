package ObjectsLesson;

import Exercises.Circle;

public class BootCamp implements Cloneable {

    int integerOne;
    int integerTwo;

    public static void main(String[] args) {

        BootCamp a, b, c;
        a = new BootCamp();
        b = new BootCamp();
        c = new BootCamp();
        //b = a;
        a.integerOne = 4;
        b.integerOne = 8;
        //b = a;

//        //clone returens a copy of the object. With all the fields set
//        //to use clone class must implement Cloneable interface
//        try {
//            c = (BootCamp) b.clone();
//
//        } catch (CloneNotSupportedException ex) {
//            Logger.getLogger(BootCamp.class.getName()).log(Level.SEVERE, null, ex);
//        }
        System.out.println("a's integerOne is " + a.integerOne + " and b's integerOne is " + b.integerOne);
        // System.out.println("C's integerOne is " + c.integerOne);

        //----------------------------------Casting ----------------------------------------
        Object aSentenceObject = "This is just a regular sentence";
        String aSentenceString = (String) aSentenceObject;

        Object aNumberObject = 3;
        // String aNumber = (String) aNumberObject;

        double avg = (double) 12 / 5;
        int rnd = (int) (29.4 / 10.0);
        int xd = (int) avg;
// -------------Strings ----------------
        String message = "Hello";
        String other = message;
        //When i change other a new String s constructed
        //other = "lala";
        System.out.println(message);
        //System.out.println(message.equals(other));
        //System.out.println(aNumber); //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

        //--------------Exercises --------------------------------
        //2.
        Circle c1 = new Circle(3.4);
        Circle c2 = new Circle(5.4);
        Circle c3 = new Circle(7.4);
        String s = "Total area\n";
        System.out.println(s + String.format("%s", s).replaceAll(".", "-") +"Circle c1 = " + c1.computeArea() + "\nCircle c2 = " + c2.computeArea() + "\nCircle c3 = " + c3.computeArea());
        //System.out.println(s.substring(0, 2));

    }
}
