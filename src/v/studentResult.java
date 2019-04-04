package v;
import java.util.Scanner;
public class studentResult {

	public static void main(String[] args) // calling method
	{
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
System.out.println("Enter student's numbers:");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
int n4=sc.nextInt();
studentResult sr= new studentResult();
String s= sr.getStudentResult(n1,n2,n3,n4); //calling statement
System.out.println("Result:" + " "+s);


	}

	String getStudentResult(int a, int b, int c, int d) // called method
	{
		if (a<35 || b<35 || c<35 || d<35 )
			return "Fail";
			double per= (a+b+c+d)/4.0;
		if (per>=85)
			return "Distinction";
		if (per>= 60)
			return "First Class";
		if (per>=50)
			return "Second Class";
		return "Pass";
	}
	
	

}