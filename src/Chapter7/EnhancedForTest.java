/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author tanverlikhon
 */
public class EnhancedForTest {

    public static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
// add each element's value to total
        for (int number : array) {
          //  System.out.println(" "+number);
            total += number;
            //number holds the array elements
            
        }
        System.out.printf("Total of array elements: %d\n", total);
    } 
}
