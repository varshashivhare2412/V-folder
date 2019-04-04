package v;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a= sc.nextInt();
		boolean rs=isPrime(a);
		if(rs)
			System.out.println(a+" is a prime number !");
		else
			System.out.println(a+" is not a prime number !");
	}

static boolean isPrime(int n)
{
	int i=2;
	while(i<=n/2)
	{
		if(n%i==0)
			return false;
	i++;	
	}
	return true;
}
} 
