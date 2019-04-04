package v;

import java.util.Scanner;

public class FirstNFibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many fibonacci number you want ?: ");
		int a= sc.nextInt();
		FirstNFibonnaci fc=new FirstNFibonnaci();
		   fc.firstNFibonnaci(a);
	}
		void firstNFibonnaci(int n)
		{
			int f1=0,f2=1,f3;
			while(n>0)
			{
				System.out.println(f1);
				f3=f1+f2;
				f1=f2;
				f2=f3;
				n--;
			}
		}
		
	}


