package v;
import java.util.Scanner;
import java.util.Random;
public class GuessRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner (System.in);
System.out.println("Guess any one number between 0 to 9 !");
int x = s.nextInt();
Random r=new Random();
int y = r.nextInt(10);
if (x==y)
	System.out.println("Wow, your guess is correct !");
else
	System.out.println("Ohh Sorry, your guess is wrong it was" +" "+y +" "+"!");
	System.out.println("Thank you !!!");
	}

}
