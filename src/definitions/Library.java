/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private static final int MAXIMUM_BOOKS_IN_LIBRARY = 2;
    private Book[] booksAvailableInLibrary;

    //Parameterized Constructor
    public Library(Book[] booksAvailableInLibrary) {
        this.booksAvailableInLibrary = booksAvailableInLibrary;
    }

    // Non-Parameterized Constructor
    public Library() {
        this.booksAvailableInLibrary = new Book[MAXIMUM_BOOKS_IN_LIBRARY];
        for (int index = 0; index < MAXIMUM_BOOKS_IN_LIBRARY; index++) {
            this.booksAvailableInLibrary[index] = new Book();
        }
    }

    // getter method
    public Book[] getBooksAvailableInLibrary() {
        return booksAvailableInLibrary.clone();
    }

    // setter method
    public void setBooksAvailableInLibrary(Book[] booksAvailableInLibrary) {
        this.booksAvailableInLibrary = booksAvailableInLibrary;
    }

    @Override
    public String toString() {
        return Arrays.toString(booksAvailableInLibrary);
    }
}
