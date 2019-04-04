package v;

import java.util.Scanner;

public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth number : ");
		int a= sc.nextInt();
		NthPrime nth=new NthPrime();
				int p=nth.nthPrime(a);
				System.out.println(p);
	}
int nthPrime(int n)
{
int i=1, count=0;
while(true)
	{
	if(PrimeNumber.isPrime(i))	
	{
		count ++;
		if(count==n)
			return i;
	}
	}
}
}
