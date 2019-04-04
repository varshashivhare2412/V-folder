package v;
import java.util.Scanner;
public class PerfectSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a= sc.nextInt();
		for (int i=1; i<=1000; i++)
		{  
		if(PerfectNumber.isPerfect(i))
			System.out.println(i+" is a perfect number !");
		else
			System.out.println(i+" is not a perfect number !");
		}

}
}
