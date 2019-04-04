package v;

import java.util.Scanner;

public class PatternABCDE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
	
for (int i=0;i<n;i++) //no.of lines.
{
	for(int j=0; j<n; j++) // no. of elements in a line.
	{
		System.out.print( (char)(j+65)+" ");
	}
	System.out.println();
}
	}

}
