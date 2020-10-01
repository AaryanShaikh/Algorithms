/* A Pythagorean Triple is a set of integers a, b and c such that a^2 + b^2 = c^2. For example, 3, 4 and 5 are Pythagorean triples because 3^2 + 4^2 = 5^2.
Given a number n, find a Pythagorean Triple for a given sum.
Input: 12
Output: 3, 4, 5 (because 3^2 + 4^2 = 5^2, and 3 + 4 + 5 = 12)
*/
import java.util.*;
public class PythagoreanTriples{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number to find its Pythagorean Triples!");
		int num = in.nextInt();
		int res,flag=0;
		for (int a=1;a<num ;a++ ) {
			for (int b=a+1;b<num ;b++ ) {
				for (int c=b+1;c<num ;c++ ) {
					res = a+b+c;
					if (res==num && (a*a)+(b*b)==(c*c)) {
						System.out.println(a+" "+b+" "+c);
						flag=1;
						break;
					}
				}
			}
		}
		if (flag==0) {
			System.out.println("No triple");
		}
	}
}
