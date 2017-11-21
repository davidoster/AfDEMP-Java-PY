/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethodexample;

/**
 *
 * @author Spyros
 */
public class GenericMethodExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray);
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray);
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray);
    }

//    public static void printArray(Integer[] inputArray) // method printArray to print Integer array
//    {
//        // display array elements
//        for (Integer element : inputArray) {
//            System.out.printf("%s ", element);
//        }
//
//        System.out.println();
//    }
//
//    public static void printArray(Double[] inputArray) // method printArray to print Double array
//    {
//        // display array elements
//        for (Double element : inputArray) {
//            System.out.printf("%s ", element);
//        }
//
//        System.out.println();
//    }
//
//    public static void printArray(Character[] inputArray) // method printArray to print Character array
//    {
//        // display array elements
//        for (Character element : inputArray) {
//            System.out.printf("%s ", element);
//        }
//
//        System.out.println();
//    }
    public static <T> void printArray(T[] inputArray) {
        // display array elements
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
