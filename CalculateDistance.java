import java.util.Scanner;
import java.lang.Math;
public class CalculateDistance{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of x1");
		int x1=in.nextInt();
		System.out.println("Enter the value of y1");
		int y1=in.nextInt();
		System.out.println("Enter the value of x2");
		int x2=in.nextInt();
		System.out.println("Enter the value of y2");
		int y2=in.nextInt();
		System.out.println("Distance="+Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
	}
}