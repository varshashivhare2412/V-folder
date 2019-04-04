package su;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		PosNeg pn= new PosNeg();
		System.out.println("Read array : ");
		int a[]=pn.readArray();
		int b[]=pn.PcNc(a);
		System.out.println("positive count : "+ b[0]);
		System.out.println("negative count : "+ b[1]);
		
	}
		
		int[] readArray() 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements you want to enter in an array :");
			int n= sc.nextInt();
			System.out.println("Enter "+ n + " values : ");
			int arr[]=new int[n];
			for (int i = 0; i < arr.length; i++) 
			{
				arr[i]=sc.nextInt();
			}
			return arr;
		}
	
	

		 int[] PcNc(int []ar)
		 {
			int pc=0,nc=0;
			for (int j = 0; j < ar.length; j++) 
			{
				if(ar[j]>=0)
					pc++;
				else
					nc++;
			}
			int ar2[]= {pc,nc};
			return ar2;
		}

	}


