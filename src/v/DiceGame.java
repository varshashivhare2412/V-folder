package v;
import java.util.Scanner;
import java.util.Random;
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Random rd= new Random();
System.out.println("Enter first player name: ");
String fname= sc.next();
System.out.println("Enter second player name: ");
String sname= sc.next();
System.out.println(fname+" Press any key from the keyboard to flip the dice: ");
sc.next();
	int fr=rd.nextInt(6)+1; //add 1 to every number because it will give numbers between 0-5 and dice consist 1-6 numbers.
	System.out.println(fname+" score is: "+fr);
sc.next();
	int sr=rd.nextInt(6)+1;
	System.out.println(sname+" score is: "+sr);

	
	
	

	}

}
