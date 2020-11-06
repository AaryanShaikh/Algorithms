/* if the square of a number ends with the number itself, it is considered to be automorphic
*/
import java.util.*;
public class AutomorphicNumbers{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		String sqr = Integer.toString(Integer.parseInt(num)*Integer.parseInt(num));
		String last = "";
		for (int i=sqr.length()-num.length();i<sqr.length() ;i++) {
			last+=sqr.charAt(i);
		}
		if (last.equals(num)) {
			System.out.println("The number is a automorphic numbers");
		}else{
			System.out.println("The number is not a automorphic numbers");
		}
	}
}