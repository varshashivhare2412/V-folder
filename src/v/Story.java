package v;
import java.util.Scanner;
public class Story {

	//<------Else if ladder--------->//
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any integer : ");
	int n=sc.nextInt();
	if(n%5==0&&n%7==0)
		System.out.println("FIZZ & BUZZ ");	
	else if (n%5==0)
		System.out.println("FIZZ");
	else if (n%7==0)
		System.out.println("BUZZ");
	

	
	}

}
