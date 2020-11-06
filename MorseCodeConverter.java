/* Morse code is a method of transmitting text information as a series of on-off tones, lights or clicks
Each letter or numeral is represented by a unique sequence of dots and dashes.
*/
import java.util.*;
public class MorseCodeConverter{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char code[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
		'v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
		String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
		"--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",
		".----","..---","...--","....-",".....","-....","--...","---..","----."}; 
		for (int i=0;i<str.length() ;i++ ) {
			for (int j=0;j<morse.length ;j++ ) {
				if (str.charAt(i)==code[j]) {
					System.out.print(morse[j]+" ");
					break;
				}
			}
		}
	}
}