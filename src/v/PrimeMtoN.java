package v;
import java.util.Scanner;
public class PrimeMtoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		PrimeMtoN mn=new PrimeMtoN();
		mn.PrimeNumber(a, b);
	}
void PrimeNumber(int m, int n)
{
	
	for(;m<=n;m++) 
	{
		if(PrimeNumber.isPrime(m))
			System.out.println(m);
	}
}
}
