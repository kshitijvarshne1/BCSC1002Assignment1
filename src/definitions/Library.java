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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksAvailableInLibrary(), library.getBooksAvailableInLibrary());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksAvailableInLibrary());
    }

    /**
     * This method is store the book detail available in Library.
     */
    public void setBooksInLibrary() {
        booksAvailableInLibrary[0].setBookName("Java A Beginnner's Guide");
        booksAvailableInLibrary[0].setAuthorName("Schildt");
        booksAvailableInLibrary[0].setThirteenDigitISBNNumber("9756234564380");
        booksAvailableInLibrary[1].setBookName("Data Structures and Algorithms");
        booksAvailableInLibrary[1].setAuthorName("Narasimha Karumanchi");
        booksAvailableInLibrary[1].setThirteenDigitISBNNumber("9555332612000");
    }
}
