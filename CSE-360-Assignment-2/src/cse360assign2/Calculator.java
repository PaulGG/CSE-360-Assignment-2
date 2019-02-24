/*
 * Name: Andrew Gellai
 * Class ID: 382
 * Assignment: Homework 1
 * Description: A simple calculator class which contains basic arithmetic operations. 
 * 				History for the calculator is stored in a string, and all arithmetic operations
 *				are done on a value (0) that is stored in the calculator from the start. 
 */

package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Sets total to 0 and ensures the history has the total in it.
	 */
	public Calculator () {
		total = 0;  
		history = "" + total;
	}
	
	/**
	 * Returns total value in the calculator.
	 * @param the value to be passed to be added
	 * @return the total value of calculator
	 */
	public int getTotal () {
		return this.total;
	}
	
	/**
	 * Adds a value to the calculator total.
	 * @param the value to be added to the total
	 */
	public void add (int value) {
		this.total += value;
		// Adds addition operator to history with value.
		this.history += " + " + value;
	}
	
	/**
	 * Subtracts a value from the calculator total.
	 * @param the value to be subtracted from the total
	 */
	public void subtract (int value) {
		this.total -= value;
		// Adds subtraction operator to history with value.
		this.history += " - " + value;
	}
	
	/**
	 * Multiply the calculator total by a value.
	 * @param the value which the total is multiplied by
	 */
	public void multiply (int value) {
		this.total *= value;
		// Adds multiplication operator to history with value.
		this.history += " * " + value;
	}
	
	/**
	 * Divides the calculator total by a value.
	 * @param the value which the total is divided by
	 * @return the total value of calculator
	 */
	public void divide (int value) {
		// Division by zero is not possible, so if the value is zero, set the total to zero.
		if (value == 0) {
			this.total = 0;
		} else {
			this.total /= value;
		}
		// Adds division operator to history with value.
		this.history += " / " + value;
	}
	
	/**
	 * Returns history of all calculator actions
	 * @param the value to be passed to be added
	 * @return the total value of calculator
	 */
	public String getHistory () {
		return history;
	}
}
