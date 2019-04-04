package v;
import java.util.Scanner;
public class PrimeWithinN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int a= sc.nextInt();
		PrimeWithinN pn=new PrimeWithinN();
				pn.PrimeWithin(a);
	}
void PrimeWithin(int n)
{
	int i=1;
	do {
		if(PrimeNumber.isPrime(i))
		{
			System.out.println(i);
		}
		i++;
	}
	while(i<=n);
}
}
