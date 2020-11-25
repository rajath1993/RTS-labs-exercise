package com.rts.exercise;
import java.util.Scanner;

public class IdentifyAboveBelow {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number of array elements: ");
		int length = reader.nextInt();
		if(length<=0) {
			System.out.println("Invalid input!!");
			return;
		}
		System.out.println("Enter the array elements: ");
		int[] list = new int[length];
		for(int i=0;i<length;i++) {
			list[i] = reader.nextInt();
		}
		System.out.println("Enter the pivot element: ");
		int num = reader.nextInt();
		
		checkAboveAndBelow(list,num);
	}
	
	/*Takes the count of elements above & below the given number and prints it*/
	public static void checkAboveAndBelow(int[] list, int checkNum) {		
		int above = 0;
		int below = 0;
		for(int x:list) {
			if(x<checkNum) {
				below++;
			}
			else if(x>checkNum) {
				above++;
			}
		}
		
		System.out.println("above:"+above+" below:"+below);
		
	}

}
