package v;
import java.util.Scanner;
public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Octal number : ");
int n=sc.nextInt();
int dec=octToDec(n);
System.out.println(n+" equivalent decimal is "+ dec);
	}
static int octToDec (int oct)
{
	int dec=0,count=0;
	do {
		int r=oct%10;
		dec=dec+r*pow(8,count);
		count++;
		oct=oct/10;
	}
	while(oct!=0);
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
