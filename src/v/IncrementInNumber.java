 package v;
import java.util.Scanner;
public class IncrementInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number : ");
int a= sc.nextInt();
IncrementInNumber in=new  IncrementInNumber();
int sm=sumofNatural (a);
}

 static int sumofNatural(int n)
{
int sum=0;

  for (int i=1;i<=n;i++)
{
	sum=sum+i;
	System.out.println(i+" = " +sum);
}
return sum;
}
}

