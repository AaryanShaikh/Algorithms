/* A number is called a Spy number, if the sum and product of its digits are equal.
For example, 123 is a Spy number, as the sum of its digits is 6 (1+2+3) which is equal to the product of its digits: 6 (1x2x3).
*/
import java.util.*;
public class TheSpyLife{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input = in.nextLine();
		String reverse = new StringBuffer(input).reverse().toString();
		String res = reverse.replaceAll("[^a-zA-Z ]", "");
		System.out.println(res);  
	}
}
