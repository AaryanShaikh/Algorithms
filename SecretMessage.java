/*You are trying to send a secret message, and you've decided to encode it by replacing every letter in your message with its corresponding letter in a backwards version
of the alphabet. 
What do your messages look like?
Task: 
Create a program that replaces each letter in a message with its corresponding letter in a backwards version of the English alphabet.
Sample Input: 
Hello World
Sample Output: 
svool dliow
*/
import java.util.Scanner;
public class SecretMessage{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input = in.nextLine();
		input = input.toLowerCase();
		String normal = "abcdefghijklmnopqrstuvwxyz";
		String reverse = new StringBuffer(normal).reverse().toString();
		char nor[] = normal.toCharArray();
		char rev[] = reverse.toCharArray();
		char inp[] = input.toCharArray();
		for (int i=0;i<inp.length ;i++) {
			for (int k=0;k<nor.length ;k++ ) {
				if (inp[i]==nor[k]) {
					inp[i] = rev[k];
					break;
				}
				else if (inp[i]==' ') {
					inp[i]=' ';
					break;
				}
				else{
					continue;
				}
			}
		}
		for (int i=0;i<inp.length ;i++ ) {
			System.out.print(inp[i]);
		}
	}
}
