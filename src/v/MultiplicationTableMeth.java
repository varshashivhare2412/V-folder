package v;
import java.util.Scanner;
public class MultiplicationTableMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationTableMeth mt=new MultiplicationTableMeth();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number: ");
		int a=sc. nextInt();
		mt.mTable(a);
	}
	void mTable(int n)
	{
		for(int i =1; i<=10; i++ )
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
