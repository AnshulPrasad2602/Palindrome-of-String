/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plaindromestackqueue;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author ANSHUL
 */
public class LinkedStack 
{
    LinkedList <Character> stack;

    public LinkedStack() 
    {
        stack = new LinkedList<Character>();
    }
    
    public void push (Character ch)
    {
        stack.push(ch);
    }
    
    public Character pop ()
    {
        return stack.pop();
    }
    
    public Character peek ()
    {
        return stack.peek();
    }
    
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    
    public void printStack ()
    {
        Iterator itr = stack.iterator();
        //ListIterator <Employee> iterator = stack.listIterator(); can use this also
        while(itr.hasNext())
        {
            Character emp = (Character) itr.next();
            System.out.println("" + emp);
        }
    }
    
    public int size ()
    {
        return stack.size();
    }
}
