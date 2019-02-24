/*
 * Name: Andrew Gellai
 * Class ID: 382
 * Assignment: Homework 1
 * Description: A simple calculator class which contains basic arithmetic operations.
 */

package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
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
	}
	
	/**
	 * Subtracts a value from the calculator total.
	 * @param the value to be subtracted from the total
	 */
	public void subtract (int value) {
		this.total -= value;
	}
	
	/**
	 * Multiply the calculator total by a value.
	 * @param the value which the total is multiplied by
	 */
	public void multiply (int value) {
		this.total *= value;
	}
	
	/**
	 * Divides the calculator total by a value.
	 * @param the value which the total is divided by
	 * @return the total value of calculator
	 */
	public void divide (int value) {
		if (value == 0) {
			this.total = 0;
		} else {
			this.total /= value;
		}
	}
	
	/**
	 * Returns history of all calculator actions
	 * @param the value to be passed to be added
	 * @return the total value of calculator
	 */
	public String getHistory () {
		return "";
	}
}
