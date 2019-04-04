package su;

import java.util.Scanner;

public class BiggestNumInArray {

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
int biggest=arr[0];
for(int j=0; j<arr.length; j++) {
	if(arr[j]>biggest)
		biggest=arr[j];

}
System.out.println("Biggest number is : " + biggest);
	}

}
