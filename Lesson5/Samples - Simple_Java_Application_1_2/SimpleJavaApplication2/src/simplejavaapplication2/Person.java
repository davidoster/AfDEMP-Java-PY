/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejavaapplication2;

/**
 *
 * @author davidoster
 */

// code from https://github.com/alekarios/JAVA_homeworks/blob/master/lesson5/simple_java_app_2/Person.java - MODIFIED
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Person {
    private String lastName;
    private String firstName;
    private String fathersName;
    private String birthday;
    private int year;
    private static PrintWriter writer = null;
    //private String writeString;
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setFatherName(String fathersName) {
        this.fathersName = fathersName;
    }
    public String getFathersName() {
        return this.fathersName;
    }
    
    public String setBirthDate() {
        // code from https://stackoverflow.com/a/27583797 - MODIFIED
        Scanner scanner = new Scanner(System.in);
        String str[] = {"day (DD)", "month (MM)", "year (YYYY)" };
        String date = "";

        for(int i = 0; i < 3; i++) {
            System.out.println("Enter your " + str[i] + " of birth : ");
            if(i == 2) {
                this.year = scanner.nextInt();
                date = date + String.valueOf(this.year);
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
    
    public void setBirthDay(String s) {
        //this.birthday = String.format("%d/%d/%d",day,month,year);
        this.birthday = s;
    }
    
    public String getBirthDay() {
        return this.birthday;
    }
    
    public String getBirthYear() {
        return String.valueOf(this.year);
    }
    
    public int getBirthYearInt() {
        return this.year;
    }
    
    public void WriteString(int i, String s) {
        if(i == 1) {
            try {
                writer = new PrintWriter(this.lastName + "." + this.firstName + ".txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        writer.println("Line " + i + ": " + s);
        if(i == 3) writer.close();
    }
}