package v;
import java.util.Scanner;
public class DeseriumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a= sc.nextInt();
		boolean res=isDeserium(a);
	
		if (res)
			System.out.println(a+" is a deserium  number !");
		else
			System.out.println(a+" is not a deserium  number !");

			}
		 static int countDigits(int n)	
		 {
			 int count=0;
			 while(n!=0) 
			 {
				 count++;
				 n=n/10;
			 }
			 return count;	 
		 }

		static int pow(int n, int p)
		{
		int pw= 1;
		while(p>0)
		{
			pw=pw*n;
		p--;
		}
		return pw;
		}

		static boolean isDeserium(int x)

		{
			int sum=0;
			int t=x;
			int dc=countDigits(x);
			do
			{
				int r= x%10;
				sum=sum+pow(r,dc);
				dc--;
				x=x/10;
			}
			while(x!=0);
			return sum==t;
		}
}
