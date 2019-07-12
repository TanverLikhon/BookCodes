/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

public class Scope {

private static int x = 1;

    public static void main(String[] args) {
        int x=5;
        System.out.printf("local x in main is %d\n", x);

        useLocalVariable(); // useLocalVariable has local x
        useField(); // useField uses class Scope's field x
        useLocalVariable(); // useLocalVariable reinitializes local x
        useField(); // class Scope's field x retains its value

        System.out.printf("\nlocal x in main is %d\n", x);
    } // end main
    // create and initialize local variable x during each call

    public static void useLocalVariable() {
        int x =25;
        System.out.printf("\nlocal x on entering method useLocalVariable is %d\n", x);
++x;
        System.out.printf("local x before exiting method useLocalVariable is %d\n", x);
    } // end method useLocalVariable

// modify class Scope's field x during each call
    public static void useField() {
        System.out.printf("\nfield x on entering method useField is %d\n", x);
     x*=10;
        System.out.printf("field x before exiting method useField is %d\n", x);
    } // end method useField
} //
