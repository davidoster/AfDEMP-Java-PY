/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesex3;

/**
 *
 * @author Spyros
 */
public class ClassesEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Author author = new Author();
        Book b = new Book();
        b.setAuthor(author);
        System.out.println(b);
        System.out.println(b.toString());
    }
    
}
