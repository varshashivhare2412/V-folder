package v;
import java.util.Scanner;
public class PrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int range= sc.nextInt();
		for (int i=1; i<=range; i++)
		{  
		if(PrimeNumber.isPrime(i))
			System.out.println(i+" is a prime number !");
		else
			System.out.println(i+" is not a prime number !");
		}
	}

}
