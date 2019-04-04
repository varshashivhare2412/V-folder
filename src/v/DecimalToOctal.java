package v;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a= sc.nextInt();
		DecimalToOctal db=new DecimalToOctal();
				String st=db.decToOct(a);
				System.out.println(st);
	}
static String decToOct(int n)
{
	String oct="";
	do
	{
		int r=n%8;
		n=n/8;
		oct=r+oct;
	}
	while(n!=0);
	return oct;
	}

}
