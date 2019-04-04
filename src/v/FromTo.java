package v;
import java.util.Scanner;
public class FromTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter From : ");
int from=sc.nextInt();
System.out.println("Enter To : ");
int to =sc.nextInt();
System.out.println("Enter By : ");
int by=sc.nextInt();

if(to<from||by<1)
{
System.out.println("Invalid inputs : ");
}
else
	for(;from<=to;from=from+by)
	{
	System.out.println(from+" ");
	}
	}

}


