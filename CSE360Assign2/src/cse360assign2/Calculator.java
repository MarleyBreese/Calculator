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
    private int initialValue;
    
    /**
     * Class constructor setting the initial value to 0.
     */
    
    public Calculator ()
    {
	initialValue = 0;  // not needed - included for clarity
    }
    
    /**
     * This method returns the total value of the number calculated. 
     * 
     * @return 0
     * 		because there are no methods to modify the initial value yet.
     */
    
    public int getTotal ()
    {
	return 0;
    }
	
    /**
     * This method adds a number to the total
     * 
     * @param valueToAdd
     * 		the number passed in to add to the total.
     */
    
    public void add (int valueToAdd)
    {
	
    }
    
    /**
     * This method subtracts numbers from the total.
     * 
     * @param valueToSub
     * 		the number passed in to subtract from the total.
     */
    
    public void subtract (int valueToSub)
    {

    }
    
    /**
     * This method multiplies numbers to the total.
     * 
     * @param valueToMult
     *		the number passed in to multiply to the total.
     */
    
    public void multiply (int valueToMult)
    {

    }
    
    /**
     * This method divides numbers from the total.
     * 
     * @param valueToDiv
     * 		the number passed in to divide from the total
     */
    
    public void divide (int valueToDiv)
    {
	
    }
    
    /**
     * This method prints out your use of the calculator, the history.
     * 
     * @return ""
     * 		because there are no methods to generate a history from yet.
     */
    
    public String getHistory ()
    {
	return "";
    }
}
