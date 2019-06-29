/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

import javax.swing.JOptionPane;

/**
 *
 * @author Tanver Likhon
 */
public class Dialog1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Wlcome \nto\nJava :) ");
        
       String str= JOptionPane.showInputDialog("What is your name?");
       JOptionPane.showMessageDialog(null,"wellcome "+str+ " to Java Programing \n");
    
    //end of chapter 3
    }
}
