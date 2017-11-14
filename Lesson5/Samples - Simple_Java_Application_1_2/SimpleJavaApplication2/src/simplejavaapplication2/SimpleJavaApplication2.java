/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejavaapplication2;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidoster
 */
public class SimpleJavaApplication2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // code from https://github.com/alekarios/JAVA_homeworks/blob/master/lesson5/simple_java_app_2/Simple_java_app_2.java - MODIFIED
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        
        System.out.println("Give your first name");
        person.setFirstName(input.next());
        
        System.out.println("Give your last name");
        person.setLastName(input.next());
        
        System.out.println("Give your father's name");
        person.setFatherName(input.next());
        
        person.setBirthDay(person.setBirthDate());
        
        for(int i = 1; i <= 3; i++){
            switch(i){
                case 1: 
                    //writer.println("Line " + i + ": " + this.lastName + ", " + this.firstName + ", " + this.fathersName);
                    person.WriteString(i,"Last Name: " + person.getLastName() + ", First Name: " + person.getFirstName() + ", Father's Name: " + person.getFathersName());
                    break;
                case 2: 
                    person.WriteString(i,"Your birthday is on: " + person.getBirthDay());
                    break;
                default: 
                    person.WriteString(i, "Your age is: " + (Calendar.getInstance().get(Calendar.YEAR) - person.getBirthYearInt()));
                break;
            }
        }
    }
}