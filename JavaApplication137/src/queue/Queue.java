/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;




import list.DoubleEndedList;

public class Queue {
    
    //instance variables
    private DoubleEndedList theList;
    
    //Constructor
    public Queue(){
        theList = new DoubleEndedList();
    }
    /**
     * Check if queue is empty
     * @return true if it's empty
     */
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    /**
     * Add object in queue
     * @param ob 
     */
    public void enque(Object ob){
        theList.insertLast(ob);
    }
    /**
     * Delete item from queue which first is in
     * @return deleted item
     */
    public Object deque(){
        return theList.deleteFirst();
    }
    /**
     * Display all elements in queue
     */
    public void display(){
        theList.dispalyList();
    }

    
    
    
    
    
    
    
 
    
}
