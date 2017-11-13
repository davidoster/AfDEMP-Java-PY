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
public class Library {

    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void printAvailableBooks() {
        String answer = "The available books are ";
        for (Book element : books) {

            if (element.isAvailable()) {
                answer.concat(element.toString());
            }

        }

    }

    public void printBookDetails(Book bookToSearch) {
        // Variable to hold the search result
        boolean exists = false;

        //Search if the given book exists in the library
        // There are better ways. But not with arrays!!
        for (Book element : books) {
            if (element.equals(bookToSearch)) {
                exists = true;
            }

            //Print book details if boook found
            if (exists) {
                System.out.print(bookToSearch.toString());
            } else {
                System.out.print(bookToSearch.toString() + " not found");
            }
        }
    }

    public void printBooksFromAuthor(Author authorToSearch) {
        StringBuilder answer = new StringBuilder("The books are ");
        int i = 0;
        for (Book element : books) {
            if (element.hasAuthor(authorToSearch.getName())) {
                answer.append(element.toString());
            }
        }
        System.out.println(answer.toString());
    }

    public Book printTheMostPopularBook() {
        Book mostPopular = null;
        int count = 0;
        for (Book element : books) {
            if (element.timesRented > count) {
                mostPopular = element;
                count = element.timesRented;
            }
        }
        return mostPopular;
    }
}
