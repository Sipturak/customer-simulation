/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import customer.Customer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import queue.Queue;


/**
 *
 * @author pc
 */
public class UIClass implements Runnable{
      
      //instance variables
      private Queue customers;
      private boolean thread;
      private int seconds;
      
      //Construcotr
      public UIClass(){
          customers = new Queue();
          thread = true;
      }
      
      /**
       * Add customer in queue when you press any key on keyboard else break from loop
       */
      public void addCustomer(){
          while(true){
               
              String input = new Scanner(System.in).nextLine();
              if(input.equals("")){
                  thread = false;
                  break;
              }
              else{
                  Customer c = new Customer();
                  //number of seconds to process ne customer with groceries that he have
                   
                  seconds = c.getGroceries() * 1000; 
                  customers.enque(c);
                  System.out.print("Customers in queue: ");
                  customers.display();

              }
          }
      }
      
      /**
       * Delete one customer in queue when you process all groceries throw imagined scanner
       */
         @Override
    public void run() {
        while(true){
            if(thread){
                try {
                    Thread.sleep(seconds);
                    System.out.println("Customer that you process: " + customers.deque());
                    System.out.print("Customers in queue: ");
                    customers.display();
                } catch (InterruptedException ex) {
                    Logger.getLogger(UIClass.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch(NullPointerException ex){
                }
            }
            else{
                break;
            }
        }
    }   

 
    
    
}
