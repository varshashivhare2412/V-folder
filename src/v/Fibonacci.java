package v;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  : ");
		int a= sc.nextInt();
		Fibonacci fc=new Fibonacci();
		fc.fibonacciWithinN(a);
	
		}
	
		
		void fibonacciWithinN(int n)
			{
				int f1=0,f2=1,f3;
				while(f1<=n)
				{
				System.out.println(f1);
				f3=f1+f2;
				f1=f2;
				f2=f3;
			
				}
		
			}
	}
		
 