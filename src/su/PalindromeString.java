package su;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string : ");
		String n= sc.nextLine();
		if(ReverseString(n))
			System.out.println(n+" is a palindrome string !");
		
		else 
		
			System.out.println(n+" is not a palindrome string !");
	}
		public static boolean ReverseString(String n) {
		if(n.length()==0||n.length()==1)
			return true;
		 if(n.charAt(0) == n.charAt(n.length()-1))
			 return ReverseString(n.substring(1, n.length()-1));
			 return false;
	}

}
