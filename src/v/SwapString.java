package v;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number s1 : ");
		String s1=sc.next();
		System.out.println("Enter the second number s2 : ");
		String s2= sc.next();
		s1=s1+s2;
		s2=s1.substring(0, (s1.length()-s2.length()));
		s1=s1.substring(s2.length(), s1.length()); 
		System.out.println("Swapped strings : s1= "+ s1  + " and s2= " + s2);
	}

}
