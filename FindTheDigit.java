/* Create a program to find all the integers values between 0 and n which contain the digit d.
(Easy) -> d can be from the range to 0 - 9
(Hard) -> d can be extended to any integer value eg. 42 53 etc.
*/
import java.util.*;
public class FindTheDigit{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int digit = in.nextInt();
		for (int i=0;i<num ;i++ ) {
			if (Integer.toString(i).contains(Integer.toString(digit))) {
				System.out.print(i+" ");
			}
		}
	}
}