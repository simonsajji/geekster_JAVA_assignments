package de;
import java.util.*;
public class pr {
	public static void main(String args[]) {
		System.out.print("enter the string");
		Scanner sr= new Scanner(System.in);
		String s=sr.nextLine();
		System.out.print(s.length());
		
		
		if(s.length()<4) {
			System.out.print("The string is short");
			
		}
		else {
			System.out.print("The string is long");
			
		}
		
		
	}
	
}
