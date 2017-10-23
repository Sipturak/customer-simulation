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
public class Link {
    
    //instance variables
    private Link next;
    private Object iData;
    
    //Constructor
    public Link (Object iData){
        this.iData = iData;
    }
    /**
     * Set value of next link
     * @param next link in list
     */
    public void setNext(Link next){
        this.next = next;
    }
    /**
     * Get next link in list
     * @return  next link
     */
    public Link getNext(){
        return next;
    }
    /**\
     * Get data of some object
     * @return object data
     */
    public Object getData(){
        return iData;
    }
    /**
     * Display one link of list
     */
    public void displayLink(){
        System.out.print(iData.toString() + " , ");
    }
}
