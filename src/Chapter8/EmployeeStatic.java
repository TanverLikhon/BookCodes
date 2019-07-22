/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 *
 * @author tanverlikhon
 */
public class EmployeeStatic {

    private String firstName;
    private String lastName;
    private static int count = 0; // number of Employees created
// initialize Employee, add 1 to static count and
// output String indicating that constructor was called

    public EmployeeStatic(String first, String last) {
        firstName = first;
        lastName = last;
        ++count; // increment static count of employees
        System.out.printf("Employee constructor: %s %s; count = %d\n",
                firstName, lastName, count);
    } // end Employee constructor
// get first name

    public String getFirstName() {
        return firstName;
    } // end method getFirstName
// get last name

    public String getLastName() {
        return lastName;
    } // end method getLastName
// static method to get static count value

    public static int getCount() {
        return count;
    } // end method getCount
} // end class Employee
