/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String thirteenDigitISBNNumber;

    public Book() {
        this.bookName = null;
        this.authorName = null;
        this.thirteenDigitISBNNumber = null;
    }

    public Book(String bookName, String authorName, String thirteenDigitISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.thirteenDigitISBNNumber = thirteenDigitISBNNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getThirteenDigitISBNNumber() {
        return thirteenDigitISBNNumber;
    }

    public void setThirteenDigitISBNNumber(String thirteenDigitISBNNumber) {
        this.thirteenDigitISBNNumber = thirteenDigitISBNNumber;
    }
}
