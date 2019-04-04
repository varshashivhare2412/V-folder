package v;
import java.util.Scanner;
public class PerfectCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int range= sc.nextInt();
		int count=0;
		for (int i=1; i<=range; i++)
		{ 
			if(PerfectNumber.isPerfect(i))
				count++;
		}
		System.out.println("Count of perfect number within range is "+ count);
	}

}
