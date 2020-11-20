/* a Composite numer is a positive integer that is not prime. In other words, it is a positive 
integer that has at least one divisor  other than 1 or itself.
input: 10;
output: true(10 has divisors other than 1 or itself i.e 2 or 5)
input: 10;
output: true(10 has divisors other than 1 or itself i.e 2 or 5)
(hard)-> write a program to print a composite numbers in a range
input:0 50
output:4 6 8 9 10 12 14 15 16 18 20 21 22 24 25 26 27 28 30 32 33 34 35 36 38 39 40 42 44 45 46 48 49 50  
*/
import java.util.*;
public class CompositeNumbers{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String range = in.nextLine();
		String minmax[] = range.split(" ");
		int min = Integer.parseInt(minmax[0]);
		int max = Integer.parseInt(minmax[1]);
		boolean isprime = true;
		for (int i=min;i<=max ;i++ ) {
			for (int j=2;j<i-1 ;j++ ) {
				if (i%j==0) {
					isprime = false;
				}
			}
			if (!isprime) {
				System.out.print(i+" ");
			}
			isprime = true;
		}
	}
}