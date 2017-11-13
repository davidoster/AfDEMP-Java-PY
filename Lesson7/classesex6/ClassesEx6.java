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
public class ClassesEx6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author ruth = new Author("Ruth");
        Author diane = new Author("Diane");
        Author jacqueline = new Author("Jacqueline");
        Author rachel = new Author("Rachel");
        Author joan = new Author("Joan");
        Author theresa = new Author("Theresa");
        Author angela = new Author("Angela");
        Author helen = new Author("Helen");
        Author lisa = new Author("Lisa");
        /**
         * Create Random books from the above authors
         */
        Book book1 = new Book("Book1", ruth, "368777540-2", 10, 2, 20);
        Book book2 = new Book("Book2", diane, "963099898-2", 10, 1, 22);
        Book book3 = new Book("Book3", jacqueline, "005382097-2", 10, 0, 23);
        Book book4 = new Book("Book4", rachel, "538310208-2", 10, 3, 24);
        Book book5 = new Book("Book5", joan, "562448132-2", 10, 4, 26);
        Book book6 = new Book("Book6", theresa, "670364563-2", 10, 2, 21);
        Book book7 = new Book("Book7", angela, "466916869-2", 10, 5, 17);
        Book book8 = new Book("Book8", helen, "764674973-2", 10, 0, 15);
        Book book9 = new Book("Book9", lisa, "052469721-2", 10, 6, 17);
        Book book10 = new Book("Book10", ruth, "609291817-2", 10, 3, 13);
        Book book11 = new Book("Book11", diane, "451378028-2", 10, 8, 12);
        Book book12 = new Book("Book12", jacqueline, "142352773-2", 10, 6, 20);
        Book book13 = new Book("Book13", rachel, "115135166-2", 10, 0, 20);
        Book book14 = new Book("Book14", joan, "631942468-2", 10, 3, 20);
        Book book15 = new Book("Book15", theresa, "323662444-2", 10, 0, 23);
        Book book16 = new Book("Book16", angela, "121360492-2", 10, 0, 12);
        Book book17 = new Book("Book17", helen, "391199302-2", 10, 0, 20);
        Book book18 = new Book("Book18", ruth, "549307784-2", 10, 1, 20);
        Book book19 = new Book("Book19", ruth, "368777230-2", 10, 23, 20);
        Book book20 = new Book("Book20", ruth, "793027213-2", 10, 0, 20);
        /**
         * Add the books to a Book array
         */
        Book[] books = {book1, book2, book3, book4, book5, book6, book7,
            book8, book9, book10, book11, book12, book13, book14, book15,
            book16, book17, book18, book19, book20};
        /**
         * Assign the book collection to the library
         */
        Library library = new Library(books);

        /**
         * Librarian, theGuyWhoKnowsAlot, undertakes the operation of the
         * library
         */
        Librarian theGuyWhoKnowsAlot = new Librarian(library);
        theGuyWhoKnowsAlot.findMeAvailableBooks();
        theGuyWhoKnowsAlot.findMeBook(book16);
        theGuyWhoKnowsAlot.findMeBooksFromAuthor(lisa);
        theGuyWhoKnowsAlot.findMostPopularBook();

    }

}
