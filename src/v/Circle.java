package v;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter radious of the circle:");
		double r=scn.nextDouble();
		System.out.println("find following.....");
		System.out.println("Area of the Circle:" +(3.14*r*r));
		System.out.println("Circumference of the circle:" +(2*3.14*r));
	}
}
