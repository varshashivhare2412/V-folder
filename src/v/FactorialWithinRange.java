package v;
import java.util.Scanner;
public class FactorialWithinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a range: ");
int n=sc.nextInt();
for(int i = 1; i<=n; i++)
{
	System.out.println(i+" ! = "+ fact(i));
}
	}
 static int fact(int x)
 {
	 int f=1;
	 while(x>1)
	 {
		 f=f*x;
		 x--;
	 }
	 	return f;
 }
}
