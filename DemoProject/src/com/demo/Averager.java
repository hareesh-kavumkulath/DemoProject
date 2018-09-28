package com.demo;

import java.util.Scanner;

/**
 * The class calculates the average of entered numbers
 * 
 * @author h_kavumk
 *
 */
public class Averager {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter a list of non negative scores");
		System.out.println("Mark end with a negative number");
		System.out.println("I will compute the average");
		
		double next, sum = 0;
		int count = 0;
		next = in.nextDouble();
		while(next >= 0) {
			sum = sum + next;
			next = in.nextDouble();
			count++;
		}
		
		if(count == 0) {
			System.out.println("No scores entered");
		}else {
			double average = sum / count;
			System.out.println(count + " scores read.");
			System.out.println("The average is " + average);
		}
		
	}

}
