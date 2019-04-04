package v;
import java.util.Scanner;
import java.util.Random;
public class DifferenceGuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter any integer");
int a= sc.nextInt();
Random rd= new Random();
int k= sc.nextInt();
System.out.println("user entered number:" +a);
System.out.println("Guessed integer" +k);
System.out.println("diff of two integers" +(a-k));
	}

}
