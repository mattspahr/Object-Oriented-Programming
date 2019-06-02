/*
 * @author Matthew Spahr
 * 001286580
 * CSI 405
 * 
 * Homework 1
 * Due: 2/28/19
 */

package com.ualbany.hw1.problem2;

import java.util.Random;
import java.lang.Math;

public class HW1Problem2 {

	/*
	 * Determines if the first integer is evenly divisible by the second integer.
	 * 
	 * @param first
	 * @param second
	 * @return - true if first is evenly divisible by second
	 * 			 false if first is not evenly divisible by second
	 */
	public boolean multiple(int first, int second) {
		int remainder = first % second;
		
		if (remainder == 0) {
			return true;
		} else return false;
	}
	
	/*
	 * Calculates the remainder of an integer divided by 7.
	 * 
	 * @param value
	 * @return - int value that is equal to the remainder of value divided by 7.
	 */
	public int remainder(int value) {
		return value % 7;
	}
	
	/*
	 * Calculates the distance between two points in a 2D plane.
	 * 
	 * @param x1 
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return - distance between two points.
	 */
	public double distance(double x1, double y1, double x2, double y2) {		
		return Math.sqrt((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
	}
	
	/*
	 * Simulates 10 flips of a coin
	 * @return - void
	 */
	public void coinFlip() {
		Random r = new Random();
		int headsCount = 0;
		int tailsCount = 0;
		
		for (int i  = 0; i < 10; i++) {
			int randomNumber = r.nextInt(2);
			String coin; 
			if (randomNumber == 0) {
				coin = "heads";
				headsCount++;
			} else {
				coin = "tails";
				tailsCount++;
			}
			System.out.print((i + 1) + ": ");
			System.out.println(coin);
		}		
		System.out.println("Number of Heads: " + headsCount);
		System.out.println("Number of Tails: " + tailsCount);
	}
}
