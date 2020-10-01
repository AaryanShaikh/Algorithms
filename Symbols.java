/* There is a problem with your keyboard: it randomly writes symbols when you are typing a text. You need to clean up the text by removing all symbols.
Take a text that includes some random symbols and translate it into a text that has none of them. The resulting text should only include letters and numbers.
Sample Input: 
#l$e%ts go @an#d@@ g***et #l#unch$$$
Sample Output: 
lets go and get lunch
*/
import java.util.*;
public class Symbols{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input = in.nextLine();
		String res = input.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(res);  
	}
}
