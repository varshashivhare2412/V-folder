package strings;

import java.util.Scanner;

public class PalindromeString{

	public static void main (String args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
		
	}
	public void palindrome(String a) {
		a=a.toLowerCase();
		int i=0, j=a.length()-1;
		while(i<j) {
				if(a.charAt(i)!=a.charAt(j));{
				System.out.println("It's not a palindrome string!");
			}
				i++;
				j++;
				
				{
					System.out.println("It's palindrome string ! ");
				}
		}
	}
}
