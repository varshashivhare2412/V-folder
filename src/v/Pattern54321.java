package v;

import java.util.Scanner;

public class Pattern54321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
	
for (int i=n;i>0;i--) //no.of lines.
{
	for(int j=0; j<n; j++) // no. of elements in a line.
	{
		System.out.print(i+" ");
	}
	System.out.println();
}
	}

}
