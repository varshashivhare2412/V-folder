package v;

import java.util.Scanner;

public class NaturalNumMeth {
int sumOfNatural(int num)// called statement
{
	int sum=0;
	while (num>=1)
	{
		sum=sum+num;
		num--;
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
NaturalNumMeth nn= new NaturalNumMeth();
System.out.println("Enter the number: ");
int n = sc.nextInt();
int sum=nn.sumOfNatural(n);//calling statement
System.out.println("Sum of first "+n+" no : "+sum);
System.out.println("---------------------------");
//System.out.println("Sum of first 20 integers: "+ nn.sumOfNatural(20));



	}

}
