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
public class Employee {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
// constructor to initialize name, birth date and hire date

    public Employee(String first, String last, Date dateOfBirth,
            Date dateOfHire) {
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    } // end Employee constructor
// convert Employee to String format

    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s",
                lastName, firstName, hireDate, birthDate);
    } // end method toString
} // end class Employee
