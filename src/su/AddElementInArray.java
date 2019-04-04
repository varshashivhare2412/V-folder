package su;

import java.util.Scanner;

public class AddElementInArray {

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
				System.out.println("Enter the index where you want to add the element : ");
				int in=sc.nextInt();
				System.out.println("Enter the value which you want to add in that index : ");
				int ele=sc.nextInt();
				if(in<0||in>=arr.length) 
					System.out.println("Invalid index !");
				
				else {
					int ar[]=new int[arr.length+1];
				
				for (int i = 0; i < arr.length; i++) {
					if(i<in) 
						ar[i]=arr[i];
					else
						ar[i+1]=arr[i];
				}
				ar[in]=ele;
				System.out.println("Array after adding the element to"
						+ " index " +in + " is :") ;
				for (int i = 0; i < ar.length; i++) {
					
					System.out.print(ar[i]+" ");
				}
			}
			


	}

}
