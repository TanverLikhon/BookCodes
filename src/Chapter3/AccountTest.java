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
public class AccountTest {
    public static void main(String[] args) {
        Account account1= new Account(50.00);
        Account account2=new Account(-7.53);
        
        System.out.println("Accout 1 balance "+account1.getBalance());
        System.out.println("Accout 2 balance "+account2.getBalance());
        
        Scanner input= new Scanner(System.in);
        double depositAmount;
        
    }
}
