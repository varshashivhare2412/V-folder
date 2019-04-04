package v;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
int a= sc.nextInt();
SumOfDigits sd=new SumOfDigits();
int sn=sd.sumOfNumberOfDigits(a);
System.out.println("Sum of digits of given number :" +sn);		

	}

	static int sumOfNumberOfDigits(int n)
	{
		int sum=0;
		do {
			sum=sum+n%10;
			n=n/10;
		}
		while(n!=0);
		return sum;
	}
}
