package v;
import java.util.Scanner;
public class EvenOddInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a=sc.nextInt();
		EvenOddInNumber eo= new EvenOddInNumber ();
		int count=eo.countEvenOdd(a);
	}
 int countEvenOdd(int n) 
	{ 
		int r=0;
	    int ec = 0; 
	    int oc = 0; 
	    do
	    {
	        r = n % 10; 
	        if (n%2 == 0)
	        	ec++;		 
	        else 
	        	oc++;   	  
	        n = n / 10;    
	    } 
	    while(n!=0);
	    System.out.println("Odd count : "+oc); 
	    System.out.println("Even count : "+ec); 
	    return oc;    
	    }

}

 
 
 
 