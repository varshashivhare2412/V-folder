  package v;
import java.util.Scanner;
public class ReverseNumberMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int a=sc.nextInt();
ReverseNumberMeth rn= new ReverseNumberMeth ();
int rd=ReverseNumber(a);
System.out.println("Reversed number : "+rd);

}
static int ReverseNumber(int n)
{
	int rev=0;
	do {
		 rev = rev * 10;
         rev = rev + n%10;
          n=n/10;	
	}
	while(n!=0);
	return rev; 
	
	
			
}

}
