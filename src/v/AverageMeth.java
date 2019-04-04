package v;
import java.util.Scanner;
public class AverageMeth {
double avgOfNum(int num)// called statement
{
	int sum=0;
	int avg=0;
	
 	while (num>=1)
	{
		sum=sum+num;
		
		avg=(sum+num)/num;
		num--;
	}
	return avg;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AverageMeth am= new AverageMeth();
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		double avg=am.avgOfNum(n);//calling statement
		System.out.println("Average of first "+n+" no. "+avg);
	
	}

}
