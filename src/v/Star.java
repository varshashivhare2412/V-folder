package v;
import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
	
for (int j=0;j<n;j++) //no.of lines.
{
	for(int i=0; i<n; i++) // no. of elements in a line.
	{
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
