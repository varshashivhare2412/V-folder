package su;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n= sc.nextInt();
		int r=ReverseNumber(n);
		if(r==n) 
			System.out.println(n+" is a palindrome number !");
		
		else 
		
			System.out.println(n+" is not a palindrome number !");
	}
		public static int ReverseNumber(int n) {
		int rev=0;
		do {
			 rev = rev * 10;
	         rev = rev + n%10;
	          n=n/10;	
		}
		while(n!=0);
		return rev;
		
		}
}
