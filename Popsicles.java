/* You have a box of popsicles and you want to give them all away to a group of brothers and sisters. If you have enough left in the box to give them each an even amount
you should go for it! If not, they will fight over them, and you should eat them yourself later.
Sample Input
3 9
Sample Output
give away
*/
import java.util.*;
public class Popsicles{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String str[] = input.split(" ");
		int siblings = Integer.parseInt(str[0]);
		int popsicles = Integer.parseInt(str[1]);
		if (popsicles%siblings==0) {
			System.out.println("give away");
		} else{
			System.out.println("eat them yourself");		
		}
	}
}
