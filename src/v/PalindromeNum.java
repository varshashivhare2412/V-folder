package v;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a= sc.nextInt();
		
		
	int rev=ReverseNumberMeth.ReverseNumber(a);
	
		if(rev==a)
		{
			System.out.println(a+" is a palindrome number !");
		}
		else 
		{
			System.out.println(a+" is not a palindrome number !");
		}

	}
 
}



