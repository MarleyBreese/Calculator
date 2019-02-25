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
    private int total; // the total that the calculator works on
    private int methodCount; // this counts the number of times a method is used
    private String[] methodHistory; // this array is used to document the method history
    
    /**
     * Class constructor setting the initial value to 0, the initial count to 0, and creating an array
     * of 100.
     */
    
    public Calculator ()
    {
	total = 0; // not needed - included for clarity
	methodCount = 0; // not needed - included for clarity
	methodHistory = new String[100]; // creates an array of 100 that will hold the method history
    }
    
    /**
     * This method returns the total value of the number calculated. 
     * 
     * @return total
     * 		the number after all the operations have been done to it, or just
     * 	the initial value.
     */
    
    public int getTotal ()
    {
	return total;
    }
	
    /**
     * This method adds a number to the total, then adds it to the history.
     * 
     * @param valueToAdd
     * 		the number passed in to add to the total.
     */
    
    public void add (int valueToAdd)
    {
	total = total + valueToAdd;
	
	createHistory("+ " + valueToAdd);
    }
    
    /**
     * This method subtracts numbers from the total, then adds it to the history.
     * 
     * @param valueToSub
     * 		the number passed in to subtract from the total.
     */
    
    public void subtract (int valueToSub)
    {
	total = total - valueToSub;
	
	createHistory("- " + valueToSub);
    }
    
    /**
     * This method multiplies numbers to the total, then adds it to the history.
     * 
     * @param valueToMult
     *		the number passed in to multiply to the total.
     */
    
    public void multiply (int valueToMult)
    {
	total = total * valueToMult;
	
	createHistory("* " + valueToMult);
    }
    
    /**
     * This method divides numbers from the total, if the number passed in is 0,
     * then it sets the total to 0, then adds it to the history.
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
	
	createHistory("/ " + valueToDiv);
    }
    
    /**
     * This method is used to store the history of the use of the calculator.
     * 
     * @param valueHistory
     * 		the string passed in that says what equation and what number was used.
     */
    
    private void createHistory (String valueHistory)
    {
	methodHistory[methodCount] = valueHistory;
	
	methodCount++;
    }
    
    /**
     * This method prints out your use of the calculator, the history.
     * 
     * @return history
     * 		the string output of the history of the use of the calculator.
     */
    
    public String getHistory ()
    {
	String history = "0 ";
	
	for(int index = 0; index < methodCount; index++)
	{
	    history += methodHistory[index] + " ";
	}
	
	return history;
    }
}
