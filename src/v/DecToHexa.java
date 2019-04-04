package v;
import java.util.Scanner;
public class DecToHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a= sc.nextInt();
		DecToHexa dx=new DecToHexa();
		String hexa=dx.decToHexa(a);
		System.out.println(hexa);
	}
String decToHexa(int n)
{
	String hx="";
	do 
	{
		int  r=n%16;
		if (r<10)
			hx=r+hx;
		else if(r==10)
			hx='A'+hx;
		else if(r==11)
			hx='B'+hx;
		else if(r==12)
			hx='C'+hx;
		else if(r==13)
			hx='D'+hx;
		else if(r==14)
			hx='E'+hx;
		else if(r==1)
			hx='F'+hx;
		n=n/16;
	}
	while (n!=0);
	return hx;
}
}
