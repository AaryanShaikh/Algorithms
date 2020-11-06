/* write a program to find how many times a given word occurs in a given string.
*/
import java.util.*;
public class WordFrequencyCounter{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String find = in.nextLine();
		String strsplit[] = str.split(" ");
		int count=0;
		for (int i=0;i<strsplit.length ;i++ ) {
			if (find.equals(strsplit[i])) {
				count++;
			}
		}
		System.out.println("\""+find+"\" has encounted "+count+" times");
	}
}