/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication137;

/**
 *
 * @author pc
 */



import ui.UIClass;
public class JavaApplication137 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
         UIClass c = new UIClass();
         Thread t = new Thread(c);
         t.start();
         System.out.println("Enter any number if you to add customer. \nIf you want"
                 + " to quit type empty string and wait to finish a process last customer: ");
         c.addCustomer();
         
      
    }
    
}
