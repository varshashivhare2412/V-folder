package v;
import java.util.Scanner;
public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Binary number : ");
int n=sc.nextInt();
int oct=binToOct(n);
System.out.println(n+" equivalent decimal is "+ oct);

	}
	static int binToOct(int bin)
	{
		int dec=0, count=0;
		do
		{
			int r=bin%10;
			dec=dec+r*pow(2, count);
			count++;
			bin=bin/10;
		}
		while(bin!=0);
		return dec;
}
	static int pow(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
	return pw;
}
	}