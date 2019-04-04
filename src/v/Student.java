package v;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("Enter first one:");
double f1=scn.nextDouble();
System.out.println("Enter second one");
double s1=scn.nextDouble();
System.out.println("------Arthimatic operation------");
System.out.println("Sum of two numbers:" +(f1+s1));
System.out.println("Difference of two numbers:" +(f1-s1));
System.out.println("Division of two numbers:" +(f1/s1));
System.out.println("Multiplication of two numbers:" +(f1*s1));
	}

}
