package Chapter7;
/**
 *
 * @author tanverlikhon
 */
public class GradeBookTest {
// main method begins program execution

    public static void main(String[] args) {
// array of student grades
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programming", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    } // end main
} //
