package v;

import java.util.Random;
import java.util.Scanner;

public class DiceGameReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rd= new Random();
		System.out.println("Enter first player name: ");
		String fname= sc.next();
		System.out.println("Enter second player name: ");
		String sname= sc.next();
		int ftotal=0, stotal=0;
		 
		while (true)
		 {
			System.out.println(fname+" Press any key from the keyboard: ");
			sc.next();
				int fr=rd.nextInt(6)+1;
				System.out.println(fname+" score is : "+fr);
				if (ftotal+fr>=0)
					ftotal=ftotal-fr;
				System.out.println(fname+" Total score is : "+ftotal);
				if(ftotal==0)
				{
					System.out.println(fname+" Won the game !");
					break;	
				}
			System.out.println(sname+" Press any key from the keyboard: ");
			sc.next();
				int sr=rd.nextInt(6)+1;
				System.out.println(sname+" score is : "+sr);
				if (stotal+sr>=0)
					stotal=stotal-sr;
				System.out.println(sname+" Total score is : "+stotal);
				if(stotal==0)
					{
					System.out.println(sname+" Won the game !");
						break;	
					}
			}

		}
}
