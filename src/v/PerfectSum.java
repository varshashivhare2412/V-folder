package v;
import java.util.Scanner;
public class PerfectSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int range= sc.nextInt();
		int sum=0;
		for (int i=1; i<=range; i++)
		{  
		if(PerfectNumber.isPerfect(i))
		sum=sum+i;
		}
		System.out.println("Sum of perfect number : "+sum);
	}

}
