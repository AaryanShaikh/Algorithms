/* The reciprocal of a letter is found by flipping the alphabet and taking the letter on the same position.
z is the reciprocal of a and vice versa. a->z,t->g,j->q etc.
*/
import java.util.*;
public class ReciprocalLetters{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char ori[] = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char rev[] = {' ','z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
		for (int i=0;i<str.length() ;i++ ) {
			for (int j=0;j<ori.length ;j++ ) {
				if (ori[j]==str.charAt(i)) {
					System.out.print(rev[j]);
					break;
				}
			}
		}
	}
}