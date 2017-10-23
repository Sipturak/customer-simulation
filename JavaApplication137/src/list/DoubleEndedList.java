/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author pc
 */
public class DoubleEndedList {
    
    //instance variables
    private Link first;
    private Link last;
    
    //Constructor
    public DoubleEndedList(){
        first = null;
        last = null;
    }
    /**
     * Check if list empty
     * @return true if it's empty
     */
    public boolean isEmpty(){
        return (first == null);
    }
    /**
     * Insert data item in link list on last position
     * @param data inserted item
     */
    public void insertLast(Object data){
        Link newLink = new Link(data);
        if(isEmpty()){
            first = newLink;
        }
        else{
            last.setNext(newLink);
        }
        last = newLink;
    }
    /**
     * Delete first item in list 
     * @return deleted data item
     */
    public Object deleteFirst(){
        Object temp = first.getData();
        if(isEmpty()){
            return 0;
        }
        first = first.getNext();
        return temp;
    }
    /**
     * Display list of all links
     */
    public void dispalyList(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.getNext();
        }
        System.out.println("");
    }
}
