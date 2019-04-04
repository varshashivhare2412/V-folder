package v;
import java.util.Scanner;
public class NthArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a= sc.nextInt();
		NthArmstrongNo nth=new NthArmstrongNo();
		int an=nth.nthArmstrong(a);
		System.out.println(an);
	}
 int nthArmstrong (int n)
 {
int i=1;

	while(n>0)
	{
		if (ArmstrongNum.isArmstrong(i))
		n--;
		i++;
	}
	return i-1;
}
}

