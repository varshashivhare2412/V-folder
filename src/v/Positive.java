package v;
import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number: ");
int n= sc.nextInt();
Positive p= new Positive();
boolean rs= p.isPositive(n);
if(rs==true)
	System.out.println(n+ " "+ "is Positive number");
else
	System.out.println(n+ " "+ "is Negative number");

	}
boolean isPositive(int x)
{
	if(x>=0)
		return true;
	else
		return false;
	
}
}

