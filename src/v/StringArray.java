package v;
import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner (System.in);
System.out.println("Enter the value:");
int n = s.nextInt();
String st[]= {"even","odd"};
System.out.println(n +""+ " is " +""+ st[n%2]);

}
}
