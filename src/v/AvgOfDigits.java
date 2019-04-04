package v;
import java.util.Scanner;
public class AvgOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a= sc.nextInt();
		AvgOfDigits ad=new AvgOfDigits();
		double an=ad.avgOfNumberOfDigits(a);
		System.out.println("Average of digits of a given number :" +an);		

			}

			static double avgOfNumberOfDigits(int n)
			{
				double sum=0;
				int count=0;
				double avg=0;
				do {
					
					sum=sum+n%10;
					n=n/10;
					count++;
					avg=sum/count;
					
				}
				
				while(n!=0);
				return avg;
			}
	}

