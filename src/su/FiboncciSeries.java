package su;

import java.util.Scanner;

public class FiboncciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int a= sc.nextInt();
		fibonacci(a);
	}
	static void fibonacci(int n) {
		int f1=0, f2=1,f3;
		while (f1<=n) {
			System.out.println(f1);
			f3=f1+f2;
			f1=f2;
			f2=f3;	
		}
	
}
}

