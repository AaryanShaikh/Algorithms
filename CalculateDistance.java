/*A Cartesian plane is defined by two perpendicular number lines: the x-axis, which is horizontal, and the y-axis, which is vertical.
Using these axes, we can describe any point in the plane using an ordered pair of numbers.

Task:
Write a program which takes two different points, A(x1,y1) and B(x2,y2), and returns the distance between these two points.
The distance formula is the Pythagorean Theorem:
For example:
Input: (2, 2) (2, -4)
Output: 6
*/
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
