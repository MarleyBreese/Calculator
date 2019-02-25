/**
 * Marley Breese
 * 334
 * Assignment 2
 * This file contains the code for the class Calculator.
 */
package cse360assign2;

/**
 * This class acts as a calculator to add, subtract, multiply, and divide from the
 * total. It also allows you to see the history of your calculator use.
 * 
 * @author marleybreese
 */

public class Calculator
{
    private int total;
    
    /**
     * Class constructor setting the initial value to 0.
     */
    
    public Calculator ()
    {
	total = 0;  // not needed - included for clarity
    }
    
    /**
     * This method returns the total value of the number calculated. 
     * 
     * @return total
     * 		The number after all the operations have been done to it, or just
     * 	the initial value.
     */
    
    public int getTotal ()
    {
	return total;
    }
	
    /**
     * This method adds a number to the total
     * 
     * @param valueToAdd
     * 		the number passed in to add to the total.
     */
    
    public void add (int valueToAdd)
    {
	total = total + valueToAdd;
    }
    
    /**
     * This method subtracts numbers from the total.
     * 
     * @param valueToSub
     * 		the number passed in to subtract from the total.
     */
    
    public void subtract (int valueToSub)
    {
	total = total - valueToSub;
    }
    
    /**
     * This method multiplies numbers to the total.
     * 
     * @param valueToMult
     *		the number passed in to multiply to the total.
     */
    
    public void multiply (int valueToMult)
    {
	total = total * valueToMult;
    }
    
    /**
     * This method divides numbers from the total, if the number passed in is 0,
     * then it sets the total to 0.
     * 
     * @param valueToDiv
     * 		the number passed in to divide from the total
     */
    
    public void divide (int valueToDiv)
    {
	if(valueToDiv == 0)
	{
	    total = 0;
	}
	else
	{
	    total = total / valueToDiv;
	}
    }
    
    /**
     * This method prints out your use of the calculator, the history.
     * 
     * @return ""
     * 		because I have not written this method yet.
     */
    
    public String getHistory ()
    {
	return "";
    }
}
