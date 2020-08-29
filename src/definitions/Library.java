/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private static final int MAXIMUM_BOOKS_IN_LIBRARY = 2;
    private Book[] booksAvailableInLibrary;


    // getter method
    public Book[] getBooksAvailableInLibrary() {
        return booksAvailableInLibrary.clone();
    }

    // setter method
    public void setBooksAvailableInLibrary(Book[] booksAvailableInLibrary) {
        this.booksAvailableInLibrary = booksAvailableInLibrary;
    }


}
