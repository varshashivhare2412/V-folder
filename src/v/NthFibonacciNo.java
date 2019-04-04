package v;
import java.util.Scanner;
public class NthFibonacciNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth fibonacci number : ");
		int a= sc.nextInt();
		NthFibonacciNo nth=new NthFibonacciNo();
		int n=nthFib(a);
		System.out.println(n);
		
	}
		static int nthFib(int n)
		{
		int f1=0,f2=1,f3;
		while(n>1)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			n--; 
			
		}
		return f1;
		
		}

}
