package v;

import java.util.Scanner;
import java.util.Scanner;
public class AveragePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int range= sc.nextInt();
		int count=0;
		double average=0;
		double sum=0;
		for (int i=1; i<=range; i++)

		{
			if(PrimeNumber.isPrime(i))
				
				sum=sum+i;
			if(PrimeNumber.isPrime(i))
				count++;
				average=sum/count;
				
		}
		System.out.println("Average of prime number within range is "+ average);
		}
		

	}


