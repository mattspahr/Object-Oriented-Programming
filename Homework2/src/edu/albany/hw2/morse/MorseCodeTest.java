package edu.albany.hw2.morse;

import java.util.Scanner;

public class MorseCodeTest {

	public static void main(String[] args) {
		int count;
		String message;
		StringBuffer output = new StringBuffer();
		MorseCode decoder = new MorseCode();
		
		// cmd arguements must be in quotes if they contain a space character
		count = args.length;
		
		if (count != 0) {
			if (count > 1) {
				System.out.println("Too many arguements input.");
			}
				output = decoder.stringtoMorseCode(args[0]);
				System.out.println(output);
		} else {
			System.out.println("Enter a string: ");
			
			Scanner keyboard = new Scanner(System.in);
			message = keyboard.nextLine();

			System.out.println("Converting to MorseCode");
			
			output = decoder.stringtoMorseCode(message);
			System.out.println(output);
		}
	}
}