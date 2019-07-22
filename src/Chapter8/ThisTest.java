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
// Fig. 8.4: ThisTest.java
// this used implicitly and explicitly to refer to members of an object.
public class ThisTest {

    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    } // end main
} // end class ThisTest
// class SimpleTime demonstrates the "this" reference

class SimpleTime {

    private int hour1; // 0-23
    private int minute1; // 0-59
    private int second1; // 0-59
// if the constructor uses parameter names identical to
// instance variable names the "this" reference is
// required to distinguish between the names

    public SimpleTime(int hour1, int minute1, int second1) {
        this.hour1 = hour1; // set "this" object's hour
        this.minute1 = minute1; // set "this" object's minute
        this.second1 = second1; // set "this" object's second
    } // end SimpleTime constructor
// use explicit and implicit "this" to call toUniversalString

    public String buildString() {
        return String.format("%24s: %s\n%24s: %s",
                "this.toUniversalString()", this.toUniversalString(),
                "toUniversalString()", toUniversalString());
    } // end method buildString
// convert to String in universal-time format (HH:MM:SS)

    public String toUniversalString() {// "this" is not required here to access instance variables,
// because method does not have local variables with same
// names as instance variables
        return String.format("%02d:%02d:%02d",
                this.hour1, this.minute1, this.second1);
    } // end method toUniversalString
} // end class SimpleTime
