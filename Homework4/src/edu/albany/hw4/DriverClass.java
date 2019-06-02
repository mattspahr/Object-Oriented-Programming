package edu.albany.hw4;

import java.util.ArrayList;

import edu.albany.hw4.binaryword.BinaryWord;
import edu.albany.hw4.semigroup.PositiveInteger;
import edu.albany.hw4.semigroup.RGBColor;
import edu.albany.hw4.semigroup.Semigroup;

public class DriverClass {

	public static void main(String[] args) {
		BinaryWord bw1 = new BinaryWord("10011101");
		BinaryWord bw2 = new BinaryWord("10100111");
		BinaryWord bw3 = new BinaryWord("10011101");
		PositiveInteger pi1 = new PositiveInteger(1);
		PositiveInteger pi2 = new PositiveInteger(2);
		PositiveInteger pi3 = new PositiveInteger(1);
		ArrayList<PositiveInteger> piList = new ArrayList<>();
		piList.add(pi1);
		piList.add(pi2);
		piList.add(pi3);
		RGBColor col1 = new RGBColor(45,126,32);
		RGBColor col2 = new RGBColor(3,222,125);
		RGBColor col3 = new RGBColor(45,126,32);
		ArrayList<RGBColor> colList = new ArrayList<>();
		colList.add(col1);
		colList.add(col2);
		colList.add(col3);
		
		System.out.println("**********Testing BinaryWord**********");
		System.out.println("BinaryWord1 is: " + bw1.toString());
		System.out.println("BinaryWord2 is: " + bw2.toString());
		System.out.println("BinaryWord3 is: " + bw3.toString());
		if (bw1.equals(bw2)) {
			System.out.println("BinaryWord1 and BinaryWord2 are equal");
		} else System.out.println("BinaryWord1 and BinaryWord2 are NOT equal");
		if (bw1.equals(bw3)) {
			System.out.println("BinaryWord1 and BinaryWord3 are equal");
		} else System.out.println("BinaryWord1 and BinaryWord3 are NOT equal");
		
		System.out.println("Complement of BinaryWord1: " + bw1.complement());
		System.out.println("Complement of BinaryWord2: " + bw2.complement());
		System.out.println("Complement of BinaryWord3: " + bw3.complement());

		System.out.println("\n**********Testing PositiveInteger**********");
		System.out.println("PositiveInteger1 is: " + pi1.toString());
		System.out.println("PositiveInteger2 is: " + pi2.toString());
		System.out.println("PositiveInteger3 is: " + pi3.toString());
		if (pi1.equals(pi2)) {
			System.out.println("PositiveInteger1 and PositiveInteger2 are equal");
		} else System.out.println("PositiveInteger1 and PositiveInteger2 are NOT equal");
		if (pi1.equals(pi3)) {
			System.out.println("PositiveInteger1 and PositiveInteger3 are equal");
		} else System.out.println("PositiveInteger1 and PositiveInteger3 are NOT equal");
		System.out.println("Combining all PositiveIntegers: " + PositiveInteger.combine(piList));
		System.out.println("Operation performed between PositiveInteger1 and PositiveInteger2: "
				+ pi1.operate(pi2).toString());
		System.out.println("Operation performed between PositiveInteger1 and PositiveInteger3: "
				+ pi1.operate(pi3).toString());
		
		System.out.println("\n**********Testing RGBColor**********");
		System.out.println("RGBColor1 is: " + col1.toString());
		System.out.println("RGBColor2 is: " + col2.toString());
		System.out.println("RGBColor3 is: " + col3.toString());
		if (col1.equals(col2)) {
			System.out.println("RGBColor1 and RGBColor2 are equal");
		} else System.out.println("RGBColor1 and RGBColor2 are NOT equal");
		if (col1.equals(col3)) {
			System.out.println("RGBColor1 and RGBColor3 are equal");
		} else System.out.println("RGBColor1 and RGBColor3 are NOT equal");
		System.out.println("Combining all RGBColors: " + RGBColor.combine(colList));
		System.out.println("Operation performed between RGBColor1 and RGBColor2: " 
				+ col1.operate(col2).toString());
		System.out.println("Operation performed between RGBColor1 and RGBColor3: " 
				+ col1.operate(col3));
		
		
	}
}
