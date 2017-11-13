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
public class Librarian {

    private Library library;

    public Librarian(Library library) {
        this.library = library;
    }

    public void findMeBooksFromAuthor(Author author) {
        library.printBooksFromAuthor(author);
    }

    public void findMeAvailableBooks() {
        library.printAvailableBooks();
    }

    public void findMeBook(Book book) {
        library.printBookDetails(book);
    }

    public void findMostPopularBook() {
        library.printTheMostPopularBook().toString();
    }

    public boolean rentBook(Book bookToRent) {
        boolean rented = false;
        if (bookToRent.availableCopies > 1) {
            System.out.println("Book is rented");
            //Reduse the available copies 
            bookToRent.availableCopies--;
            // times rented 
            bookToRent.timesRented++;
            rented = true;
        }
        return rented;
    }

}
