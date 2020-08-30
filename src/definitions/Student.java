/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssuedByTheStudent() {
        return numberOfBooksIssuedByTheStudent;
    }

    public void setNumberOfBooksIssuedByTheStudent(int numberOfBooksIssuedByTheStudent) {
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
    }

    public Book[] getNamesOfTheBooksIssuedByTheStudent() {
        return namesOfTheBooksIssuedByTheStudent;
    }

    public void setNamesOfTheBooksIssuedByTheStudent(Book[] namesOfTheBooksIssuedByTheStudent) {
        this.namesOfTheBooksIssuedByTheStudent = namesOfTheBooksIssuedByTheStudent;
    }

    @Override
    public String toString() {
        return "Name of Student: " + getStudentName() + ", " +
                "University Roll Number: " + getUniversityRollNumber() + ", " +
                "Number of Books Issued: " + getNumberOfBooksIssuedByTheStudent() + ", " +
                "Names of Books Issued: " + Arrays.toString(getNamesOfTheBooksIssuedByTheStudent()) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooksIssuedByTheStudent() == student.getNumberOfBooksIssuedByTheStudent() &&
                Objects.equals(getStudentName(), student.getStudentName()) &&
                Arrays.equals(getNamesOfTheBooksIssuedByTheStudent(), student.getNamesOfTheBooksIssuedByTheStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getUniversityRollNumber(), getNumberOfBooksIssuedByTheStudent());
        result = 31 * result + Arrays.hashCode(getNamesOfTheBooksIssuedByTheStudent());
        return result;
    }

    /**
     * This method will issue the books to the Student
     *
     * @param bookIndex The index of the book which is issuing.
     * @param bookName  The name of the book which is issuing
     */
    public void issueBooksToStudents(int bookIndex, String bookName) {
        namesOfTheBooksIssuedByTheStudent[bookIndex].setBookName(bookName);
    }

    /**
     * This method will return the confirmation for return book
     *
     * @param bookIndex The index of the book which is issuing.
     */
    public boolean returnBook(int bookIndex) {
        return bookIndex != 0;
    }

    /**
     * This method will show the book which is issued
     */
    public void showIssuedBooksByStudent() {
        System.out.println("These are the books issued by you:- ");
        for (int index = 0; index < NUMBER_OF_MAXIMUM_BOOKS_ISSUE; index++) {
            if (namesOfTheBooksIssuedByTheStudent[index].getBookName() != null) {
                System.out.print(namesOfTheBooksIssuedByTheStudent[index].getBookName() + (index < getNumberOfBooksIssuedByTheStudent() - 1 ? ", " : ".\n"));

            }
        }
    }
}
