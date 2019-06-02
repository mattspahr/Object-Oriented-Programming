/*
 * @author Matthew Spahr
 * 001286580
 * CSI 405
 * 
 * Homework 1
 * Due: 2/28/19
 */

package com.ualbany.hw1.problem1;

import java.text.DecimalFormat;

public class EmployeeTest {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		Employee e1 = new Employee("Matt", "Spahr", 1000.5);
		Employee e2 = new Employee();
		
		// Set e2 first name to Dylan and set last name to Rohme.
		e2.setFirstName("Dylan");
		e2.setLastName("Rohme");
		
		// Set e2 monthly salary to 750.25.
		e2.setMonthlySalary(750.25);
		
		/*
		 *  Yearly Salary is calculated by getting the monthly salary and 
		 *  multiplying it by 12 for each month of the year.
		 */
		double yearlySalary1 = e1.getMonthlySalary() * 12;
		double yearlySalary2 = e2.getMonthlySalary() * 12;
		
		System.out.println("Employee 1:");
		System.out.println("First Name: " + e1.getFirstName());
		System.out.println("Last Name: " + e1.getLastName());
		System.out.println("Yearly Salary: " + df.format(yearlySalary1));
		
		System.out.println("\nEmployee 2:");
		System.out.println("First Name: " + e2.getFirstName());
		System.out.println("Last Name: " + e2.getLastName());
		System.out.println("Yearly Salary: " + df.format(yearlySalary2));
		
		double raise1 = e1.getMonthlySalary() * .1;
		raise1 = e1.getMonthlySalary() + raise1;
		
		double raise2 = e2.getMonthlySalary() * .1;
		raise2 = e2.getMonthlySalary() + raise2;
		
		e1.setMonthlySalary(raise1);
		e2.setMonthlySalary(raise2);
		
		yearlySalary1 = e1.getMonthlySalary() * 12;
		yearlySalary2 = e2.getMonthlySalary() * 12;	
		
		System.out.println("\n***** After 10% Raise *****");
		
		System.out.println("\nEmployee 1:");
		System.out.println("First Name: " + e1.getFirstName());
		System.out.println("Last Name: " + e1.getLastName());
		System.out.println("Yearly Salary: " + df.format(yearlySalary1));
		
		System.out.println("\nEmployee 2:");
		System.out.println("First Name: " + e2.getFirstName());
		System.out.println("Last Name: " + e2.getLastName());
		System.out.println("Yearly Salary: " + df.format(yearlySalary2));
	}
}
