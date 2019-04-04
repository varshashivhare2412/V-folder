package v;
import java.util.Scanner;
public class SettedBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a= sc.nextInt();
		SettedBit sb=new SettedBit();
		int b=sb.countSettedBits(a);
		System.out.println(b);
	}
 int countSettedBits(int n)
{
	int count=0;
	do 
	{
		int r=n%2;
		if(r==1)
		count++;
		n=n/2;	
	}
	
	while(n!=0)	;
	
	return count;
}

}