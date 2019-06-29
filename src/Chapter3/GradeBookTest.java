/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;
import java.util.Scanner;
/**
 *
 * @author Tanver Likhon
 */
public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook myGradeBook=new GradeBook();
        String str;
        Scanner Input =new Scanner (System.in);
        str=Input.next();

        myGradeBook.setCourseName(str);
        myGradeBook.displayMessage();
        
        //creating object 2 with constructor
        
          
        String str1;
        str1=Input.next();
        GradeBook myGradeBook1=new GradeBook(str1);
        myGradeBook1.displayMessage();
        
        
        
    }
    
}
