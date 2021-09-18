package de;
import java.util.*;

public class palindrome_method2 {
	
	public static void main(String args[]) {
		
		// method2 to check palindrome or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word to check whether palindrome or not");
		String orginal = sc.nextLine();
		orginal = orginal.toLowerCase();
		int nb = orginal.length();
		
		String reverse = "";
		
		for(int i=nb-1; i>=0; i--) {
			reverse= reverse + orginal.charAt(i);
		}
		
		
		if(orginal.equals(reverse)) {
			System.out.println("Given word is palindrome");
		}else {
			System.out.println("Given word is not a palindrome");
		}
	}
	
	
}
