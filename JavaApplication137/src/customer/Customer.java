/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author pc
 */
public class Customer {
    //instance variables
    private int groceries;
    
    //Constructor
    public Customer(){
        groceries = (int)(Math.random() * 100); //radnom number from(0...99)
    }
    
    /**
     * Get number of groceries pick random
     * @return number of groceries
     */
    public int getGroceries(){
        return groceries;
    }
   
}
