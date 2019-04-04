package v;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the first number s1 : ");
int s1=sc.nextInt();
System.out.println("Enter the second number s2 : ");
int s2= sc.nextInt();
  s1=s1+s2;
  s2=s1-s2;
  s1=s1-s2;
  System.out.println("Swapped number : s1=" + s1+ " and s2 : " + s2);
	}

}
