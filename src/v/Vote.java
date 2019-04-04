package v;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S= new Scanner (System.in);
System.out.println("Hi! What's your name ?");
String name= S.next();
System.out.println("Hello!" +"  "+ name  +"  "+"What's your age?");
int age= S.nextInt();
if (age>=18)
	System.out.println(name +"  "+"you are eligible to vote !");

else
	System.out.println(name +"  "+"you are not eligible to vote !");	

	}

}
