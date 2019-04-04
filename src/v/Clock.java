package v;
import java.util.Scanner;
public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter hour and minute : ");
int hr=sc.nextInt();
int min=sc.nextInt();
double hangle= hr*30+min*0.5;
double mangle=min*6;
double angle;
if(hangle>mangle)
	angle=hangle-mangle;
else
	angle=mangle-hangle;

if (angle>180)
	angle=360-angle;
System.out.println("Least angle is "+ angle);

	}

}
