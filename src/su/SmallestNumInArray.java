package su;

import java.util.Scanner;

public class SmallestNumInArray {
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
int smallest=arr[0];
for(int j=0; j<arr.length; j++) {
	if(arr[j]<smallest)
		smallest=arr[j];

}
System.out.println("Smallest number is : " + smallest);
	}
}
