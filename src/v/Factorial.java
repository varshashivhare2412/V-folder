package v;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number:");
		int n= sc.nextInt();
	
Factorial fc=new Factorial();
System.out.println("Factorial of "+n+" is "+fc.fact(n) );
	}
int fact(int n)
{
	int f=1;
	while(n>1)
	{
		f=f*n;
		n--;
	}
	return f;	
}
}
