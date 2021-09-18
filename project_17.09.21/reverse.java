package de;

import java.util.Scanner;
import java.lang.Math;

public class reverse {
	
	// /*Questions: Take input a 3digit or more in length and then reverse it   input: 12345
   //  output:54321

   

	
	public static void main(String args[]) {
		System.out.print("enter the intgr");
		Scanner sr= new Scanner(System.in);
		int k=sr.nextInt();
		String temp = Integer.toString(k);
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
		    numbers[i] = temp.charAt(i) - '0';
		}
		
		System.out.println("The orginal number is:");
		int b=(numbers.length-1);
		for(int p=0;p<numbers.length;p++) {
			
			System.out.print(numbers[p]);
			
		}
		
		
		for(int a=0;a<(numbers.length)/2;a++){
			int t=numbers[a];
			numbers[a]=numbers[b];
			numbers[b]=t;
			
			b--;
		}
		
		System.out.println("The reversed number is:");
		
		for(int u=0;u<numbers.length;u++) {
			
			System.out.print(numbers[u]);
			
		}
		
		
		
		
		
		
		
		
}


		
}