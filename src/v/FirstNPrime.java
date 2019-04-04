package v;
import java.util.Scanner;

public class FirstNPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many prime numbers you want? : ");
		int n=sc.nextInt();
		FirstNPrime fp=new  FirstNPrime();
		fp.NPrime(n);
		
	}
	void NPrime(int n)
	{
		int i=1;
		do
		{
			if(PrimeNumber.isPrime(i))
		{
			System.out.println(i);
			n--;
		}
		i++;
		}
		while(n>0);
		
	}
}
