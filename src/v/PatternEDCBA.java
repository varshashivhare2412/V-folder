package v;

import java.util.Scanner;

public class PatternEDCBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
	
for (int i=n;i>0;i--) //no.of lines.
{
	for(int j=n; j>0; j--) // no. of elements in a line.
	{
		System.out.print( (char)(j+64)+ " ");
	}
	System.out.println();
}
	}

}
