/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private static final int NUMBER_OF_MAXIMUM_BOOKS_ISSUE = 2;
    private String studentName;
    private long universityRollNumber;
    private int numberOfBooksIssuedByTheStudent;
    private Book[] namesOfTheBooksIssuedByTheStudent;

    // Parameterized Constructor
    public Student(String studentName, long universityRollNumber, int numberOfBooksIssuedByTheStudent, Book[] namesOfTheBooksIssuedByTheStudent) {
        this.studentName = studentName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
        this.namesOfTheBooksIssuedByTheStudent = namesOfTheBooksIssuedByTheStudent;
    }

    // Non-Parameterized Constructor
    public Student() {
        this.studentName = "";
        this.universityRollNumber = 0L;
        this.numberOfBooksIssuedByTheStudent = 0;
        this.namesOfTheBooksIssuedByTheStudent = new Book[NUMBER_OF_MAXIMUM_BOOKS_ISSUE];
        for (int index = 0; index < NUMBER_OF_MAXIMUM_BOOKS_ISSUE; index++) {
            this.namesOfTheBooksIssuedByTheStudent[index] = new Book();
        }
    }
}
