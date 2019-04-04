package v;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a= sc.nextInt();
		DecimalToBinary db=new DecimalToBinary();
				String st=db.decToBin(a);
				System.out.println(st);
	}
static String decToBin(int n)
{
	String bin="";
	do
	{
		int r=n%2;
		n=n/2;
		bin=r+bin;
	}
	while(n!=0);
	return bin;
}
}
