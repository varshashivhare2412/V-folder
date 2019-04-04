package v;
import java.util.Scanner;
public class HexaToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hexadecimal number : ");
		String hexa=sc.next();
		int dec=hexToDec(hexa);
		System.out.println(hexa+" equivalent decimal is "+ dec);
			}
	static int hexToDec(String hx)
	{
		int dec=0, count=0;
		for(int i=hx.length()-1;i>=0;i--,count++)
		{
			char ch=hx.charAt(i);
			if (ch>='A'&& ch<='F')
				dec=dec+(ch-55)*pow(16,count);
			else if
			(ch>='a'&& ch<='f')
				dec=dec+(ch-87)*pow(16,count);
			else
				dec=dec+(ch-48)*pow(16,count);
		}
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
