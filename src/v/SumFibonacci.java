package v;
import java.util.Scanner;
public class SumFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a= sc.nextInt();
		SumFibonacci sf=new SumFibonacci();
		int s=sf.sumOfFib(a);
		System.out.println("Sum of fibonacci series : "+s);
	}
	 int sumOfFib(int n)
	 {
		 int f1=0,f2=1,f3;
		 int sum=0;
		 while(n>0)
		 {
			 sum=sum+f1;
			 f3=f1+f2;
			 f1=f2;
			 f2=f3;
			 n--; 
		 }
		 return sum;
	}

}
