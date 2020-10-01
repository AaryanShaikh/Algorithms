/*You write a phrase and include a lot of number characters (0-9), but you decide that for numbers 10 and under you would rather write the word out instead. Can you go 
in and edit your phrase to write out the name of each number instead of using the numeral?
Sample Input: 
i need 2 pumpkins and 3 apples
Sample Output: 
i need two pumpkins and three apples
*/
import java.util.Scanner;
public class NoNumerals{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		String words[] = str.split(" ");
		for (int i=0;i<words.length ;i++ ) {
			switch (words[i]) {
				case "1": words[i] = "one";
						break;
				case "2": words[i] = "two";
						break;
				case "3": words[i] = "three";
						break;
				case "4": words[i] = "four";
						break;
				case "5": words[i] = "five";
						break;
				case "6": words[i] = "six";
						break;
				case "7": words[i] = "seven";
						break;
				case "8": words[i] = "eight";
						break;
				case "9": words[i] = "nine";
						break;
				case "10": words[i] = "ten";
						break;
				default:
						break;
			}		
		}
		for (int i=0;i<words.length ;i++ ) {
			System.out.print(words[i]+" ");
		}
	}
}
