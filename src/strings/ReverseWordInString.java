package strings;

import java.util.Scanner;

public class ReverseWordInString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		String [] s1=s.split(" ");
		String revString=" ";
		
		for (int i=0; i<s1.length; i++) {
			String rev=" ";
			String s2=s1[i];
			for (int j= s2.length()-1; j >=0; j--) {	
			rev=rev+s2.charAt(j);
		}
			revString = revString+rev;
		}
		System.out.println(revString);
}
}
	
