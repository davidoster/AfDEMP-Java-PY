/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesex6;

/**
 *
 * @author Spyros
 */
public class Book {

    String title;
    Author author;
    final String isbn;
    int physicalCopies;
    int availableCopies;
    int timesRented;

    public Book(String title, Author author, String isbn, int physicalCopies, int availableCopies, int timesRented) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.physicalCopies = physicalCopies;
        this.availableCopies = availableCopies;
        this.timesRented = timesRented;
    }

    @Override
    // I use he toString() method of author
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author.toString() + ", isbn=" + isbn + ", physicalCopies=" + physicalCopies + ", availableCopies=" + availableCopies + ", timesRented=" + timesRented + '}';
    }

    public boolean isAvailable() {
        //return availableCopies>0?true:false; --reduntant
        return availableCopies > 0;
    }

    public boolean hasAuthor(String author) {
        // why equals and not == ??????
        return this.author.getName().equals(author);
    }
}
