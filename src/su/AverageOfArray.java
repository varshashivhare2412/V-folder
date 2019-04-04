package su;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter in an array :");
		int n= sc.nextInt();
		System.out.println("Enter "+ n + " values : ");
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
	int sum =0;
	double avg=0;
	for(int i=0; i<arr.length;i++) 
	{
		sum=sum+arr[i];
		avg=sum/arr.length;
	}
	System.out.println("Average of all the elements present inside array : "+ avg);
}



	}


