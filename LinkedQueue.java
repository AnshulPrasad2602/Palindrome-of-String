/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plaindromestackqueue;

import java.util.LinkedList;

/**
 *
 * @author ANSHUL
 */
public class LinkedQueue 
{
    LinkedList <Character> queue;

    public LinkedQueue() 
    {
        queue = new LinkedList <Character>();
    }
    
    public void enQueue (Character ch)
    {
        queue.add(ch);
    }
    
    public Character deQueue()
    {
        return queue.remove();
    }
    
    public Character peek ()
    {
        return queue.peek();    //or queue.get(0)
    }
    
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
    
    public int size ()
    {
        return queue.size();
    }
    
    public void printQueue()
    {
        for (Character emp : queue)
        {
            System.out.println("" + emp);
        }
    }
}
