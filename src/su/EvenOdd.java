package su;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		EvenOdd eo= new EvenOdd();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter in an array :");
		int n= sc.nextInt();
		System.out.println("Enter "+ n + " values : ");
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		int ar1[]=eo.ecOc(arr);
	}
		 int[] ecOc(int []ar)
		 {
			int ec=0,oc=0;
			for (int j = 0; j < ar.length; j++) 
			{
				if(ar[j]%2==0)
					ec++;
				else
					oc++;
			}
			int ar2[]= {ec,oc};
		 
			
			System.out.println("Even count: "+ ar2[0]);
			System.out.println("Odd count: "+ ar2[1]);
			return ar2;
 
		 }
	}
	
