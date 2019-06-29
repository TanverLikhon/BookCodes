/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author Tanver Likhon
 */
public class GradeBook {
    private String courseName;
    public GradeBook(){}
    public GradeBook(String str)
    {
        courseName=str;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public void displayMessage()
    {
        System.out.println("Welcome to the Grade Book");
       
    }
}
