/* A Mersenne Prime is a prime number that is one less than a power of two. It is a prime number of
the form 2^n -1 for some integer n.
input: 3
output: true (3 is a prime number and 3 = 2^2-1).
*/
import java.util.*;
public class MersennePrime{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int res = 0;
		for (int i=0;i<num ;i++ ) {
			res = (int)(Math.pow(2, i))-1;
			if (res==num) {
				System.out.println("Number is a Mersenne Prime");
				System.exit(1);
			}
		}
		System.out.println("Number is not a Mersenne Prime");
	}
}