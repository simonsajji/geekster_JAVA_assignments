package de;
import java.util.*;
public class palindrome {
	
	// check whether string is palindrome or not
	
	
	public static void main(String args[]) {
		
		System.out.println("Enter the string to check palindrome or not:- ")
		
		Scanner sc=new Scanner(System.in);
		String h=sc.nextLine();
		System.out.println(h.length());
		sc.close();
		int flag=0;
		int j=(h.length()-1);
		for(int i=0;i<(h.length())/2;i++) {
			if(h.charAt(i)==h.charAt(j)) {
				++i;
				--j;
				flag=1;
			}
			else {
				flag=0;
			}
			
			
		}
		if(flag==1) {
			System.out.println("The striing is palindrome !!");
		}
		else {
			System.out.println("The string is NOT palindrome !");
		}
		
		
		
		
	}
		
	
}
