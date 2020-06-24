/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plaindromestackqueue;

import java.util.Scanner;

/**
 *
 * @author ANSHUL
 */
public class PlaindromeStackQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter string to check palindrome : ");
        
        String str = sc.nextLine();
        
        boolean result = palindrome(str);
        
        if (result)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
    
    public static boolean palindrome (String str)
    {
        str = str.toLowerCase();
        
        LinkedStack stack = new LinkedStack();
        LinkedQueue queue = new LinkedQueue();
        
        for (int i= 0; i < str.length(); i++)
        {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                stack.push(str.charAt(i));
                queue.enQueue(str.charAt(i));
            }
        }
        
        String stackString = "";
        String queueString = "";
        
        for (int i = 0; i < stack.size(); i++)
        {
            stackString = stackString + stack.pop();
            queueString = queueString + queue.deQueue();
        }
        
        return stackString.equals(queueString);
    }
    
}
