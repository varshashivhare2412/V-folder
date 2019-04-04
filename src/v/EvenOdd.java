package v;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner (System.in);
System.out.println("Enter the value:");
int n = s.nextInt();
if (n%2==0)
	System.out.println(n+"is even");
	else
	System.out.println(n+"is odd");
    System.out.println("Thank you");
	}

}

