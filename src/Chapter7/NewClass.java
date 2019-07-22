/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;
import java.util.Arrays;
/**
 *
 * @author tanverlikhon
 */
public class NewClass {
    private static final int x=3;
    public static void main(String[] args) {
        int [][] arr=new int [8][8];
        for(int i=0;i<arr.length;i++)
        {
            
            for(int j=0;j<arr[i].length;j++)
                System.out.print(""+arr[i][j]+"  ");
            System.out.println("");
        }
       int [] arr1=new int [10];
       int [] arr2=new int [10];
       
       Arrays.fill(arr1,8);
       for(int i : arr1)
            System.out.print(" "+i);
       System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println("After copy the array ");
       for(int i : arr2)
            System.out.print(" "+i);
       
        System.out.println("  "+String.format("%d %d",1,2));
        
        System.out.println("  "+x);

    }
}
