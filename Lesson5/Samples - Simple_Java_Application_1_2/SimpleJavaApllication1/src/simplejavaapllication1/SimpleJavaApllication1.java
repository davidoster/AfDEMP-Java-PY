/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejavaapllication1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidoster
 */
public class SimpleJavaApllication1 {
    protected static int year = 0;

    public static void main(String[] args) {
        // code from https://github.com/alekarios/JAVA_homeworks/blob/master/lesson5/Java_simple_app_1.java - MODIFIED
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give your first name");
        String firstName = input.next();
        
        System.out.println("Give your last name");
        String lastName = input.next();
        
        System.out.println("Give your father's name");
        String fathersName = input.next();
        
        /*System.out.println("Give your  day of birth (xx)");
        int day = input.nextInt();
        System.out.println("Give your month of birth (xx)");
        int month = input.nextInt();
        System.out.println("Give your year of birth (xxxx)");
        int year = input.nextInt();
        String birthday = String.format("%d/%d/%d", day, month, year);*/

        String birthday = setDate();
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(lastName + "." + firstName + ".txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimpleJavaApllication1.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 1; i <= 3; i++){
            switch(i){
                case 1: 
                    writer.println("Line " + i + ": Last Name: " + lastName + ", First Name: " + firstName + ", Father's Name: " + fathersName);
                    break;
                case 2: 
                    writer.println("Line " + i + ": Your birthday is on: " + birthday);
                    break;
                default: 
                    //writer.println("Line " + i + ": " + "Your age is " + (2017 - SimpleJavaApllication1.year));
                    writer.println("Line " + i + ": " + "Your age is " + (Calendar.getInstance().get(Calendar.YEAR) - SimpleJavaApllication1.year));
                    writer.close();
                break;
            }
        }
    }
    
    private static String setDate() {
        // code from https://stackoverflow.com/a/27583797 - MODIFIED
        Scanner scanner = new Scanner(System.in);
        String str[] = {"day (DD)", "month (MM)", "year (YYYY)" };
        String date = "";

        for(int i = 0; i < 3; i++) {
            System.out.println("Enter your " + str[i] + " of birth : ");
            if(i == 2) {
                SimpleJavaApllication1.year = scanner.nextInt();
                date = date + String.valueOf(SimpleJavaApllication1.year);
            }
            else 
                date = date + scanner.next() + "/";
        }
        //date = date.substring(0, date.length()-1);
        //System.out.println("date: " + date); 

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = null;

        try {
            parsedDate = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsedDate.toString();
    }
}
