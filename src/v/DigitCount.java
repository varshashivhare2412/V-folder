package v;
import java.util.Scanner;
public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
DigitCount dc=new DigitCount();
System.out.println("Enter a number: ");
int a=sc.nextInt();
dc.numberOfDigits(a);

	}
int numberOfDigits(int n)
{
	int count=0;
	do {
		
		n=n/10;
		count++;
	}

	while(n!=0);
	System.out.println("Count of digits : "+ count);
	
		return count;
	
		
}
}
