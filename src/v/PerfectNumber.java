package v;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number : ");
int a= sc.nextInt();
PerfectNumber pn=new PerfectNumber();
boolean ip=pn.isPerfect(a);
if (ip)
	System.out.println(a+" is a perfect number! ");
else
	System.out.println(a+ " is not a perfect number : ");
	}
	
 static boolean isPerfect(int n)
{
int sum=0;
int i=1;
while(i<=n/2)
{
	if(n%i==0)
		sum=sum+i;
	i++;
}
if(sum==n)
	return true;
else
	return false;
}
}
