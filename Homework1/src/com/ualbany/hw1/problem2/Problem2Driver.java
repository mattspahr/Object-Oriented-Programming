/*
 * @author Matthew Spahr
 * 001286580
 * CSI 405
 * 
 * Homework 1
 * Due: 2/28/19
 */

package com.ualbany.hw1.problem2;

import java.util.Scanner;

public class Problem2Driver {

	public static void main(String[] args) {
		HW1Problem2 test = new HW1Problem2();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("***** Test multiple() *****");
		System.out.println("Please enter the first integer: ");
		int first = keyboard.nextInt();
		System.out.println("Please enter the second integer: ");
		int second = keyboard.nextInt();
		if (test.multiple(first, second)) {
			System.out.println("The first integer is evenly divisible by the second integer.");
		} else {
			System.out.println("The first integer is NOT evenly divisible by the second integer.");
		}
		
		System.out.println("\n***** Test remainder() *****");
		System.out.println("Enter a value: ");
		int value = keyboard.nextInt();
		System.out.println("When divided by 7, the remainder is : " + test.remainder(value));
		
		System.out.println("\n***** Test distance() *****");
		System.out.print("Enter the x-value in Point 1: ");
		double x1 = keyboard.nextInt();
		System.out.print("Enter the y-value in Point 1: ");
		double y1 = keyboard.nextInt();
		System.out.print("Enter the x-value in Point 2: ");
		double x2 = keyboard.nextInt();
		System.out.print("Enter the y-value in Point 2: ");
		double y2 = keyboard.nextInt();
		System.out.println("The distance between the two points is: " + test.distance(x1, y1, x2, y2));
		
		System.out.println("\n***** Test coinFlip() *****");
		test.coinFlip();
		keyboard.close();
	}
}
