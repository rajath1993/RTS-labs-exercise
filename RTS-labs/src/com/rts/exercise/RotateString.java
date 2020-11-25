package com.rts.exercise;

import java.util.Scanner;
/*
 * #2  Rotate the characters in a string by a given input and have the overflow appear at the beginning, 
 * e.g. “MyString” rotated by 2 is “ngMyStri”.
 * */

public class RotateString {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the string to be rotated: ");
		String inputString = reader.nextLine();
		if(inputString.equals("")) {
			System.out.println("String cannot be empty!");
			return;
		}
		System.out.println("Enter a number to rotate the string: ");
		int num = reader.nextInt();
		
		rotateString(inputString,num);
	}
	
	/*overflow appears at the beginning, made use of modulus to handle it.*/
	public static void rotateString(String inputString,int num) {
		String res = "";
		/*identifying the prefix & suffix of the rotated string, by taking the substring*/
		String prefix = inputString.substring(inputString.length()-(num%inputString.length()), inputString.length());
		String suffix = inputString.substring(0,inputString.length()-(num%inputString.length()));
		
		res = prefix+suffix;
		
		System.out.println(res);
	}
	
	/*
	 * Time Complexity: The Java method substring takes a time of O(n) from Java 7 onwards
	 * Space Complexity: String takes a space of O(n).
	 * */

}
