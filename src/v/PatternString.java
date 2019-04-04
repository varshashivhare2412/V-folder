package v;

import java.util.Scanner;

public class PatternString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string that you want to print : ");
		String st=sc.nextLine();
		int l=st.length();
	
for (int i=0;i<l;i++) //no.of lines.
{
	for(int j=0; j<l; j++) // no. of elements in a line.
	{
		System.out.print(st.charAt(j)+" ");
	}
	System.out.println();
}
	}

}
