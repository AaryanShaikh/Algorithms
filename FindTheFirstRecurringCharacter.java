/* write a program that takes a string as input and returns the first recurring character as 
the output.
input: abca
output: a
input: bcaba
output: b
input: abc
output: None
*/
import java.util.*;
public class FindTheFirstRecurringCharacter{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String res = "";
		for (int i=0;i<str.length() ;i++ ) {
			if (i==0) {
				res+=Character.toString(str.charAt(i));
			}
			else if (!res.contains(Character.toString(str.charAt(i)))) {
				res+=Character.toString(str.charAt(i));
			}else{
				System.out.println(str.charAt(i));
				System.exit(1);
			}
		}
		System.out.println("None");
	}
}