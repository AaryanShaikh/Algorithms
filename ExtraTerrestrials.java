/*You meet a group of aliens, and their language is just like English except that they say every word backwards. 
How will you learn to communicate with them?
Sample Input: 
howdy
Sample Output: 
ydwoh
*/
import java.util.*;
public class ExtraTerrestrials{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input = in.nextLine();
		String reverse = new StringBuffer(input).reverse().toString();
		System.out.println(reverse);
	}
}
