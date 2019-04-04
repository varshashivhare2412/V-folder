package v;
import java.util.Scanner;
public class circleMethod {
 
	void calculateCircle (double r)
	{
		System.out.println("Enter the radius of circle:" + " "+r);
		double a= 3.4*r*r;
		System.out.println("Area of circle; " +a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	circleMethod a= new circleMethod();
		a.calculateCircle(9);
	}

}
