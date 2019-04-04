package su;

import java.util.Scanner;

public class DeleteElementFromArray {

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
		System.out.println("Enter the index from which you want to delete the element : ");
		int in=sc.nextInt();
		if(in<0||in>=arr.length) 
			System.out.println("Invalid index !");
		
		else {
			int ar[]=new int[arr.length-1];
		
		for (int i = 0; i < arr.length-1; i++) {
			if(i<in) 
				ar[i]=arr[i];
			else
				ar[i]=arr[i+1];
			
			
		}
		System.out.println("Array after deleting the element from index " +in + "is :") ;
		for (int i = 0; i < ar.length; i++) {
			
			System.out.print(ar[i]+" ");
		}
	}
	}
	}
